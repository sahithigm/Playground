#include<iostream>
int main()
{
  int n,d;
  std::cin>>n;
  int s=0;
  do
  {
    d=n%10;
    s++;
    n=n/10;
  }while(n>0);
  std::cout<<s;
}