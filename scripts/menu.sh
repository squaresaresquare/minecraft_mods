#/bin/bash
read -p "Enter the name of your block: " NAME
echo
COUNT=0
INGREDIENT_STRING=""
while :
  read -p "Enter an ingredient to your recipe or hit just enter when done: " TMP
  INGREDIENT="$(echo $TMP | tr '[:lower:]' '[:upper:]' )"
  [[ INGREDIENT != "" ]] && [ ${COUNT} -lt 9 ]
do
  if [[ "${INGREDIENT}" == "" ]];then
    break
  fi
  echo "$INGREDIENT"
  INGREDIENTS[${COUNT}]=${INGREDIENT}
  if [[ "${INGREDIENT_STRING}" == "" ]];then
    INGREDIENT_STRING="${INGREDIENT}"
  else
    INGREDIENT_STRING="${INGREDIENT_STRING},${INGREDIENT}"
  fi
  echo "[$INGREDIENT_STRING]"
  ((COUNT++))
done

INGREDIENTS[${COUNT}]="<blank>"

echo "build your recipe. 3 numbers of three numbers"
echo "your ingredients are:"

for i in $(seq 0 ${COUNT})
do
  echo "${i} : ${INGREDIENTS[${i}]}"
done

read -p "Enter the first row on the crafting table [${COUNT}${COUNT}${COUNT}]: " LINE

echo
if [[ "$LINE" == "" ]];then
  LINE="${COUNT}${COUNT}${COUNT}"
fi
tmp=$(echo ${LINE} | sed "s/${COUNT}/ /g")
LINE=${tmp}


RECIPE="'${LINE}'"
echo "recipe: ${RECIPE}"
read -p "Enter the second row on the crafting table [${COUNT}${COUNT}${COUNT}]: " LINE
echo
if [[ "$LINE" == "" ]];then
  LINE="${COUNT}${COUNT}${COUNT}"
fi
tmp=$(echo ${LINE} | sed "s/${COUNT}/ /g")
LINE=${tmp}

RECIPE="${RECIPE},'${LINE}'"
echo
read -p "Enter the third row on the crafting table [${COUNT}${COUNT}${COUNT}]: " LINE
echo
if [[ "$LINE" == "" ]];then
  LINE="${COUNT}${COUNT}${COUNT}"
fi
tmp=$(echo ${LINE} | sed "s/${COUNT}/ /g")
LINE=${tmp}

RECIPE="${RECIPE},'${LINE}'"

read -p "Enter the number of blocks your recipe will produce: " NUM
echo
TAB=("building_blocks"
     "architecture_blocks"
     "quad_window"
     "double_window")

echo '0) building blocks'
echo '1) architecture blocks'
echo '2) triple arch window blocks'
echo '3) double arch window blocks'
read ANS
echo

if [[ ${ANS} == "" ]]
then
  command="./Add_Block.py -m \"/Users/seanpaulbobadilla/Documents/GitRepos/minecraft_mods/architecture_blocks\" -b ${NAME} -i \"${INGREDIENT_STRING}\" -r \"${RECIPE}\" -t building_blocks -c $NUM"
else
  command="./Add_Block.py -m \"/Users/seanpaulbobadilla/Documents/GitRepos/minecraft_mods/architecture_blocks\" -b ${NAME} -i \"${INGREDIENT_STRING}\" -r \"${RECIPE}\" -t ${TAB[$ANS]} -c $NUM"
fi
echo "$command"
read -p 'Run the above command (y/n) [n]: ' TMP
ANS=$(echo "$TMP" | tr '[:lower:]' '[:upper:]')
if [[ "${ANS}" == "Y" ]]
then
  echo "running ..."
  bash -c "${command}"
fi
