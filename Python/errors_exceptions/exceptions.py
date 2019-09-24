# https://www.hackerrank.com/challenges/exceptions/problem

if __name__ == '__main__':
    t = int(input())
    arr = []
    for tc in range(1, t + 1):
        arr.append(input().split())

    for tc in arr:
        try:
            print(int(tc[0]) // int(tc[1]))
        except (ZeroDivisionError, ValueError) as e:
            print('Error Code:', e)
