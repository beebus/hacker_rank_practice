# https://www.hackerrank.com/challenges/calendar-module/problem

import calendar

user_input = input().split()
m = int(user_input[0])
d = int(user_input[1])
y = int(user_input[2])

print(list(calendar.day_name)[calendar.weekday(y, m, d)].upper())
