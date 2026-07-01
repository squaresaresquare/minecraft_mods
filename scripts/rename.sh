#!/bin/bash
trap 'exit;exit' SIGINT
while [[ -n "$(find ../architecture_blocks/src -iname 'quad*')" ]];do 
find ../architecture_blocks/src -name 'quad*' | while read -r old_name
do
  new_name=$(echo $old_name | sed 's/quad/triple/')
  echo "mv $old_name $new_name"
  read junk
  ans=''
  read -sr -n1 -p '(y/n) ' ans </dev/tty
  echo
  [[ "$ans" == "q" ]] && exit
  if [[ "$ans" == "y" ]];then
    mkdir -p $(dirname $new_name)
    mv $old_name $new_name
  fi
done
find ../architecture_blocks/src -name 'Quad*'| while read -r old_name
do
  new_name=$(echo $old_name | sed 's/Quad/Triple/')
  echo "mv $old_name $new_name"
  ans=''
  read -sr -n1 -p '(y/n) ' ans </dev/tty
  echo
  [[ "$ans" == "q" ]] && exit
  if [[ "$ans" == "y" ]];then
    mkdir -p $(dirname $new_name)
    mv $old_name $new_name
  fi
done
done
grep -irl 'quad' ../architecture_blocks/src | grep -v 'script\|menu' | while read -r change_file
do
  echo "in file $change_file change"
  while IFS= read -r line
  do
    test=$(echo $line | tr [:lower:] [:upper:])
    if [[ "$test" =~ "QUAD" ]];then
      echo "$line"
    fi
  done < "$change_file"
  echo
  echo "to"
  echo
  cat $change_file | sed 's/QUAD_WINDOW/TRIPLE_WINDOW/g' | sed 's/quad_window/triple_window/g' | sed 's/QuadWindow/TripleWindow/g' | sed 's/Quad Window/Triple Window/g' | sed 's/quad window/triple window/g' | grep 'TRIPLE_WINDOW\|triple_window\|TripleWindow\|Triple Window\|triple window'
  echo
  ans=''
  read -sr -n1 -p '(y/n) ' ans </dev/tty
  echo
  [[ "$ans" == "q" ]] && exit
  if [[ "$ans" == "y" ]];then
    sed -i '' 's/QUAD_WINDOW/TRIPLE_WINDOW/g' $change_file
    sed -i '' 's/quad_window/triple_window/g' $change_file
    sed -i '' 's/QuadWindow/TripleWindow/g' $change_file
    sed -i '' 's/Quad Window/Quad Window/g' $change_file
    sed -i '' 's/quad window/quad window/g' $change_file
  fi
  echo
done
