#!/usr/bin/env python3
from pathlib import Path
import re, signal


class nameChange:
    def __init__(self):
        self.oldName = str()
        self.oldUppercaseName = str()
        self.oldCapitalizedName = str()
        self.current_record = {}
        self.newName = str()
        self.newUppercaseName = str()
        self.newCapitalizedName = str()
        
    def _create_permutations(self, name):
        NameParts = re.split(r"[-_]", name)
        lcDescription = ' '.join(NameParts)
        capDescription = lcDescription.capitalize()
        newList = [x.capitalize() for x in NameParts]
        CapitalizedName = ''.join(newList)
        newList = [x.upper() for x in NameParts]
        uppercaseName = '_'.join(newList)
        return [CapitalizedName, uppercaseName, lcDescription, capDescription]

    def _rename_files(self,oldName, newName):
        directory_path = Path("/Users/seanpaulbobadilla/Documents/GitRepos/minecraft_mods/architecture_blocks/src")
        filename_pattern = "*" + oldName + "*j[as][ov][na]"
        matching_files = list(directory_path.rglob(filename_pattern))
        for file_path in matching_files:
            print("\nmove\n\t" + str(file_path.absolute()) + "\nto\n\t" + str(file_path.absolute()).replace(oldName, newName))

    def _update_files(self, oldName, newName):
        directory_path = Path("/Users/seanpaulbobadilla/Documents/GitRepos/minecraft_mods/architecture_blocks/src")
        text_pattern = re.compile((oldName))
        for file_path in list(directory_path.rglob("*j[as][ov][na]")):
            if file_path.is_file():
                msg = str()
                try:
                    with open(file_path, "r", encoding="utf-8", errors="ignore") as file:
                        for line in file:
                            if text_pattern.search(line):
                                msg += line.replace(oldName,newName)
                except (PermissionError, FileNotFoundError):
                    continue
                if len(msg) > 0:
                    print(str(file_path.absolute()) + "\n")
                    print(msg + "\n")



    def changeName(self, oldName, newName):
        old = self._create_permutations(oldName)
        new = self._create_permutations(newName)
        
        oldUppercaseName = old[1]
        oldCapitalizedName = old[0]
        oldLcDescription = old[2]
        oldCapDescription = old[3]
        newUppercaseName = new[1]
        newCapitalizedName = new[0]
        newLcDescription = new[2]
        newCapDescription = new[3]
        
        self._update_files(oldName, newName)
        self._update_files(oldCapitalizedName, newCapitalizedName)
        self._update_files(oldUppercaseName, newUppercaseName)
        self._update_files(oldLcDescription, newLcDescription)
        self._update_files(oldCapDescription, newCapDescription)

        self._rename_files(oldName, newName)
        self._rename_files(oldCapitalizedName, newCapitalizedName)
        self._rename_files(oldUppercaseName, newUppercaseName)
        
    

def signal_handler(sig: int, frame, obj: object):
    print("ctrl-c was hit")


def main():
    #handle SIGINT (ctrl c)
    signal.signal(signal.SIGINT, signal_handler)
    #Command line options
    file_fixer = nameChange()
    file_fixer.changeName("triple_window_0_1", "left_end_base")


if __name__ == "__main__":
        main()
