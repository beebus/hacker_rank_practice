# https://www.hackerrank.com/challenges/bash-tutorials---comparing-numbers/problem
read x
read y
if [ "$x" -lt "$y" ]
then
    echo "X is less than Y"
fi

if [ "$x" -gt "$y" ]
then
    echo "X is greater than Y"
fi

if [ "$x" -eq "$y" ]
then
    echo "X is equal to Y"
fi
