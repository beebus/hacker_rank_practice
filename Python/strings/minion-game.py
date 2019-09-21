# https://www.hackerrank.com/challenges/the-minion-game/problem


def minion_game(str_original):
    # your code goes here
    vowels = 'AEIOU'
    kevsc = 0
    stusc = 0

    for i in range(len(str_original)):
        if str_original[i] in vowels:
            kevsc += (len(str_original) - i)
        else:
            stusc += (len(str_original) - i)

    if kevsc > stusc:
        print("Kevin", kevsc)
    elif kevsc < stusc:
        print("Stuart", stusc)
    else:
        print("Draw")


if __name__ == '__main__':
    s = input()
    minion_game(s)
