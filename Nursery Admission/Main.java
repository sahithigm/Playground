#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
int main ()
{
char str1[50];
gets(str1);
int l=strlen(str1);
cout << "The number of letters in the name is "<<l;
return 0;
}
