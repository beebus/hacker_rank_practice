# https://www.hackerrank.com/challenges/collections-counter/problem

from collections import Counter

num_shoes = int(input())
shoes = Counter(map(int, input().split()))
num_cust = int(input())

income = 0

for i in range(num_cust):
    size, price = map(int, input().split())
    if shoes[size]:
        income += price
        shoes[size] -= 1

print(income)
