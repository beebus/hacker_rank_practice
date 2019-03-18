\*
https://www.hackerrank.com/challenges/c-tutorial-basic-data-types/
*\

#include <iostream>
#include <iomanip>
#include <cstdio>
#include <string>
using namespace std;

int main() 
{
    string s[5];

    for (int i=0; i<5; i++){
        getline(cin, s[i], ' ');
    }
    int one = atoi(s[0].c_str());
    long two = stol(s[1].c_str());
    char three = s[2][0];
    float four = stof(s[3].c_str());
    double five = stod(s[4].c_str());

    cout << one << endl;
    cout << two << endl;
    cout << three << endl;
    cout << fixed << setprecision(3) << four << endl;
    cout << fixed << setprecision(9) << five << endl;

    return 0;
}

