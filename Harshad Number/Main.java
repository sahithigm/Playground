#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int num=n,s=0,r;
  while(n>0)
  {
    r=n%10;
    s=s+r;
    n=n/10;
  }
  if(num%s==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}