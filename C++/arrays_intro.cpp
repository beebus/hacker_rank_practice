\*
https://www.hackerrank.com/challenges/arrays-introduction/

You'll be given an array of N integers and you have to print the integers in the reverse order.

Input Format
------------
The first line of the input contains N,where N is the number of integers. The next line contains N integers separated by a space.

Constraints
-----------
1 <= N <= 1000
1 <= A<i> <= 10000, where A<i> is the i-th integer in the array.

Output Format
-------------
Print the N integers of the array in the reverse order in a single line separated by a space.
*\

#include <iostream>     // std::cout, std::cin
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int num_of_ints;

    cin >> num_of_ints;
    int arr[num_of_ints];

    for (int i = 0; i < num_of_ints; i++)
    {
        cin >> arr[i];
    }

    for (int i = num_of_ints - 1; i >= 0; i--)
    {
        cout << arr[i] << ' ';
    }

    return 0;
}
