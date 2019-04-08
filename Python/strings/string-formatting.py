# https://www.hackerrank.com/challenges/python-string-formatting/problem

def print_formatted(number):
    for x in range(1, number):
        print(x, oct(x), hex(x), bin(x))


if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
