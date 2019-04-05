-- https://www.hackerrank.com/challenges/the-blunder/problem

/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/

SELECT ROUND(AVG(SALARY) -
    AVG(CONVERT(int,REPLACE(CONVERT(char,SALARY),'0',''))),0,1)+1
FROM EMPLOYEES;
