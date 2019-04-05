-- https://www.hackerrank.com/challenges/weather-observation-station-2/problem

/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT CONVERT(decimal(10,2),ROUND(SUM(LAT_N),2)) AS lat,
    CONVERT(decimal(10,2),ROUND(SUM(LONG_W),2)) AS lon
FROM STATION;
