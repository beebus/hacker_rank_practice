# https://www.hackerrank.com/challenges/bash-tutorials---getting-started-with-conditionals/problem
read c
if [ "${c^^}" == "Y" ]
then
    echo YES
fi
if [ "${c^^}" == "N" ]
then
    echo NO
fi
