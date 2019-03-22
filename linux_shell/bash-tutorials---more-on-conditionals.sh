# https://www.hackerrank.com/challenges/bash-tutorials---more-on-conditionals/problem
read x
read y
read z
if [ "$x" == "$y" ] && [ "$y" == "$z" ]; then
    echo "EQUILATERAL"
else 
    if [ "$x" == "$y" ] || [ "$y" == "$z" ] || [ "$x" == "$z" ]; then
        echo "ISOSCELES"
    else
        echo "SCALENE"
    fi
fi
