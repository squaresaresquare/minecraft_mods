#!/usr/bin/env python3
from pathlib import Path
import re, signal, shutil, hashlib, subprocess, inspect, pprint


class nameChange:
    def __init__(self):
        self.oldName = str()
        self.oldUppercaseName = str()
        self.oldCapitalizedName = str()
        self.current_record = {}
        self.newName = str()
        self.newUppercaseName = str()
        self.newCapitalizedName = str()

    def _get_md5_legacy(self, filename):
        hash_md5 = hashlib.md5()
        with open(filename, "rb") as f:
            # Read the file in 4096-byte chunks until empty
            while chunk := f.read(4096):
                hash_md5.update(chunk)
        return hash_md5.hexdigest()

    def _create_permutations(self, name):
        NameParts = re.split(r"[-_]", name)
        lcDescription = ' '.join(NameParts)
        capDescription = lcDescription.capitalize()
        newList = [x.capitalize() for x in NameParts]
        CapitalizedName = ''.join(newList)
        newList = [x.upper() for x in NameParts]
        uppercaseName = '_'.join(newList)
        return {"CapitalizedName" : CapitalizedName, "uppercaseName" : uppercaseName, "lcDescription" : lcDescription, "capDescription" : capDescription}

    def _rename_files(self,oldName, newName):
        print("_rename_files\n")
        directory_path = Path("/Users/seanpaulbobadilla/Documents/GitRepos/architecture_blocks/src")
        filename_pattern = "*" + oldName + "*"
        old = self._create_permutations(oldName)
        new = self._create_permutations(newName)
        
        matching_files = list(directory_path.rglob(filename_pattern))
        pprint.pprint(matching_files)
        for old_file_path in matching_files:
            resolved_old_path = old_file_path.resolve()
            new_file_path = str(resolved_old_path).replace(oldName, newName)
            print(f"rename {str(resolved_old_path)} to {str(new_file_path)}")
            result = subprocess.run(['mv', str(resolved_old_path), str(new_file_path)], capture_output=True, text=True)
            print(result.stdout + '\n')
            print(f"return code {result.returncode}\n")
            
        print(f"pattern : *{old['CapitalizedName']}*")
        filename_pattern_CapitalizedName = f"pattern : *{old['CapitalizedName']}*"
        matching_files = list(directory_path.rglob(filename_pattern_CapitalizedName))
        for old_file_path in matching_files:
            resolved_old_path = old_file_path.resolve()
            new_file_path = str(resolved_old_filepath).replace(old['CapitalizedName'],new['CapitalizedName'])
            print(f"rename {str(old_file_path)} to {str(new_file_path)}")
            result = subprocess.run(['mv', str(resolved_old_file_path), str(new_file_path)], capture_output=True, text=True)
            print(result.stdout + '\n')
            print(f"return code {result.returncode}\n")
            old_file_path.rename(new_file_path)

        print(f"pattern : *{old['uppercaseName']}*j[as][ov][na]")
        filename_pattern_uppercaseName = f"pattern : *{old['uppercaseName']}*j[as][ov][na]"
        matching_files = list(directory_path.rglob(filename_pattern_uppercaseName))
        for old_file_path in matching_files:
            resolved_old_path = old_file_path.resolve()
            new_file_path = str(resolved_old_filepath).replace(old['uppercaseName'],new['uppercaseName'])
            print(f"rename {str(old_file_path)} to {str(new_file_path)}")
            result = subprocess.run(['mv', str(resolved_old_file_path), str(new_file_path)], capture_output=True, text=True)
            print(result.stdout + '\n')
            print(f"return code {result.returncode}\n")
            old_file_path.rename(new_file_path)

    def _update_files(self, oldName, newName):
        print("_update_files\n")
        directory_path = Path("/Users/seanpaulbobadilla/Documents/GitRepos/architecture_blocks/src")
        text_pattern_name = re.compile(oldName)
        old = self._create_permutations(oldName)
        new = self._create_permutations(newName)
        text_pattern_CapitalizedName = re.compile(old["CapitalizedName"])
        text_pattern_uppercaseName = re.compile(old["uppercaseName"])
        text_pattern_lcDescription = re.compile(old["lcDescription"])
        text_pattern_capDescription = re.compile(old["capDescription"])
        try:
            for file_path in list(directory_path.rglob("*j[as][ov][na]")):
                r_file_path = file_path.resolve()
                print(f"******** {str(r_file_path)} *********")
                if file_path.is_file():
                    msg = str()
                    temp_path = file_path.with_suffix(".tmp")
                    r_temp_path = temp_path.resolve()
                    print(f"******** {str(r_temp_path)} *********")
                    try:
                        with file_path.open("r") as infile, temp_path.open("w") as outfile:
                            
                            for line in infile:
                                if text_pattern_name.search(line) or text_pattern_CapitalizedName.search(line) or text_pattern_uppercaseName.search(line) or text_pattern_lcDescription.search(line) or text_pattern_capDescription.search(line):
                                    line = line.replace(oldName,newName)
                                    line = line.replace(old["CapitalizedName"],new["CapitalizedName"])
                                    line = line.replace(old["uppercaseName"],new["uppercaseName"])
                                    line = line.replace(old["lcDescription"],new["lcDescription"])
                                    msg += line.replace(old["capDescription"],new["capDescription"])
                                    print("write line to " + str(outfile.name))
                                    if len(msg) > 0:
                                        print(msg)
                                        outfile.write(msg)
                                else:
                                    print(line)
                                    outfile.write(line)
                                msg = str()
                    except Exception as e:
                        print(f"error, {e}")

                    result = subprocess.run(['diff', str(r_file_path), str(r_temp_path)], capture_output=True, text=True)
                    print(result.stdout + '\n\n')
            
                    with open(file_path, "r", encoding="utf-8") as file:
                        infile_line_count = sum(1 for line in file)
                    with open(temp_path, "r", encoding="utf-8") as file:
                        outfile_line_count = sum(1 for line in file)
                    print(f"does {str(infile_line_count)} equal {str(outfile_line_count)}\n")
                    if infile_line_count == outfile_line_count:
                        print ("rename file")
                        try:
                            r_temp_path = temp_path.resolve()
                            r_file_path = file_path.resolve()
                            print(f"check if temp file {r_temp_path} and origional file {r_file_path} are the same file.")
                                
                            if r_temp_path == r_file_path:
                                raise RuntimeError(f"error: temp file {r_temp_path} and origional file {r_file_path} are the same, coding error.")

                            file_path_md5sum = self._get_md5_legacy(r_file_path)
                            temp_path_md5sum = self._get_md5_legacy(r_temp_path)
                            result = subprocess.run(['ls', '-l', str(r_temp_path)], capture_output=True, text=True)
                            print(result.stdout + '\n\n')
                            result = subprocess.run(['ls', '-l', str(r_file_path)], capture_output=True, text=True)
                            print(result.stdout + '\n\n')
                            result = subprocess.run(['cp', str(r_temp_path), str(r_file_path)], capture_output=True, text=True)
                            print(result.stdout + '\n')
                            print(f"return code {result.returncode}\n")
                            result = subprocess.run(['ls', '-l', str(r_file_path)], capture_output=True, text=True)
                            print(result.stdout + '\n\n')
                            print("diff and return code")
                            result = subprocess.run(['diff', str(r_temp_path), str(r_file_path)], capture_output=True, text=True)
                            print(result.stdout + '\n')
                            print(f"return code {result.returncode}\n")
                            if result.returncode != 0:
                                raise RuntimeError("file failed to copy")
                            else:
                                print("file move successful")
                            result = subprocess.run(['rm','-f',str(r_temp_path)], capture_output=True, text=True)
                            if result.returncode != 0:
                                print(result.stdout + '\n' + result.stderr + '\n' + str(result.returncode))
                                raise RuntimeError("file failed to copy")                       
                        except Exception as e:
                            print(f"error, {e}")
                    else:
                        with file_path.open("r") as infile, temp_path.open("r") as outfile:
                            content = infile.read()
                            print(r_file_path)
                            print(str(content))
                            content = outfile.read()
                            print(r_temp_path)
                            print(str(content))
                        raise RuntimeError("bad file copy")
        except (PermissionError, FileNotFoundError):
            pass

    def changeName(self, oldName, newName):
        old = self._create_permutations(oldName)
        new = self._create_permutations(newName)
        
        oldUppercaseName = old["uppercaseName"]
        oldCapitalizedName = old["CapitalizedName"]
        oldLcDescription = old["lcDescription"]
        oldCapDescription = old["capDescription"]
        newUppercaseName = new["uppercaseName"]
        newCapitalizedName = new["CapitalizedName"]
        newLcDescription = new["lcDescription"]
        newCapDescription = new["capDescription"]
        
        #self._update_files(oldName, newName)


        self._rename_files(oldName, newName)
        self._rename_files(oldCapitalizedName, newCapitalizedName)
        self._rename_files(oldUppercaseName, newUppercaseName)
        #self._update_files(oldName, newName)
        
    

def signal_handler(sig: int, frame, obj: object):
    print("ctrl-c was hit")


def main():
    #handle SIGINT (ctrl c)
    signal.signal(signal.SIGINT, signal_handler)

    blocks=[["triple_window_0_1","left_end_base"],
        ["triple_window_0_2","left_pillar_base"],
        ["arched_window_left_half_column_base","right_half_pillar_base"],
        ["arched_window_middle_base","center_pillar_base"],
        ["arched_window_right_half_column_base","left_half_pillar_base"],
        ["triple_window_0_3","right_pillar_base"],
        ["triple_window_0_4","right_end_base"],
        ["triple_window_1_1","Left_end_middle"],
        ["triple_window_1_2","left_pillar_middle"],
        ["arched_window_left_half_column_middle","right_half_pillar_middle"],
        ["arched_window_middle_column","center_pillar_middle"],
        ["arched_window_right_half_column_middle","left_half_pillar_middle"],
        ["triple_window_1_3","right_pillar_middle"],
        ["triple_window_1_4","right_end_middle"],
        ["triple_window_2_1","Left_end_cap"],
        ["triple_window_2_2","left_pillar_cap"],
        ["arched_window_middle_cap","center_pillar_cap"],
        ["arched_window_left_half_column_cap","right_half_pillar_cap"],
        ["arched_window_right_half_column_cap","left_half_pillar_cap"],
        ["triple_window_2_3","right_pillar_cap"],
        ["triple_window_2_4","right_end_cap"],
        ["five_block_arch_1_1","double_window_arch_row1_col1"],
        ["five_block_arch_1_2","double_window_arch_row1_col2"],
        ["six_block_inner_arch","inner_arch_block"],
        ["five_block_arch_1_4","double_window_arch_row1_col4"],
        ["five_block_arch_1_5","double_window_arch_row1_col5"],
        ["five_block_arch_2_1","double_window_arch_row2_col1"],
        ["five_block_arch_2_2","double_window_arch_row2_col2"],
        ["five_block_arch_2_3","double_window_arch_row2_col3"],
        ["five_block_arch_2_4","double_window_arch_row2_col4"],
        ["five_block_arch_2_5","double_window_arch_row2_col5"],
        ["five_block_arch_3_2","double_window_arch_row3_col2"],
        ["five_block_arch_3_3","double_window_arch_row3_col3"],
        ["five_block_arch_3_4","double_window_arch_row3_col4"],
        ["triple_window_2_0","triple_window_arch_row1_col1"],
        ["triple_window_2_5","triple_window_arch_row1_col6"],
        ["triple_window_3_0","triple_window_arch_row2_col1"],
        ["triple_window_3_1","triple_window_arch_row2_col2"],
        ["triple_window_3_4","triple_window_arch_row2_col5"],
        ["triple_window_3_5","triple_window_arch_row2_col6"],
        ["triple_window_4_0","triple_window_arch_row4_col1"],
        ["triple_window_4_1","triple_window_arch_row4_col2"],
        ["triple_window_4_2","triple_window_arch_row4_col3"],
        ["triple_window_4_3","triple_window_arch_row4_col4"],
        ["triple_window_4_4","triple_window_arch_row4_col5"],
        ["triple_window_4_5","triple_window_arch_row4_col6"],
        ["triple_window_5_1","triple_window_arch_row5_col2"],
        ["triple_window_5_2","triple_window_arch_row5_col3"],
        ["triple_window_5_3","triple_window_arch_row5_col4"],
        ["triple_window_5_4","triple_window_arch_row5_col5"],
        ["six_block_arch_1_1","quadruple_window_arch_row1_col1"],
        ["six_block_arch_1_8","quadruple_window_arch_row1_col8"],
        ["six_block_arch_2_1","quadruple_window_arch_row2_col1"],
        ["six_block_arch_2_2","quadruple_window_arch_row2_col2"],
        ["six_block_arch_2_7","quadruple_window_arch_row2_col7"],
        ["six_block_arch_2_8","quadruple_window_arch_row2_col8"],
        ["six_block_arch_3_1","quadruple_window_arch_row3_col1"],
        ["six_block_arch_3_2","quadruple_window_arch_row3_col2"],
        ["six_block_arch_3_3","quadruple_window_arch_row3_col3"],
        ["six_block_arch_3_6","quadruple_window_arch_row3_col6"],
        ["six_block_arch_3_7","quadruple_window_arch_row3_col7"],
        ["six_block_arch_3_8","quadruple_window_arch_row3_col8"],
        ["six_block_arch_4_2","quadruple_window_arch_row1_col2"],
        ["six_block_arch_4_3","quadruple_window_arch_row1_col3"],
        ["six_block_arch_4_4","quadruple_window_arch_row1_col4"],
        ["six_block_arch_4_5","quadruple_window_arch_row1_col5"],
        ["six_block_arch_4_6","quadruple_window_arch_row1_col6"],
        ["six_block_arch_4_7","quadruple_window_arch_row1_col7"]]
    #Command line options
    file_fixer = nameChange()
    for elem in blocks:
        file_fixer.changeName(elem[0], elem[1])
if __name__ == "__main__":
        main()
