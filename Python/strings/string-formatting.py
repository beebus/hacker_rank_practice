# https://www.hackerrank.com/challenges/python-string-formatting/problem


def print_formatted(number):
    width = len(bin(number)) - 2
    for x in range(1, number+1):
        print(str(x).rjust(width),
              str(oct(x)[2:]).rjust(width),
              str(hex(x)[2:]).upper().rjust(width),
              str(bin(x)[2:]).rjust(width))


if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
