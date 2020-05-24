#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a>>b;
  int x,y;
  y=2000+b;
  if(a>b)
  {
    x=1900+a;
    std::cout<<y-x;
  }
  else
  {
    x=2000+a;
    std::cout<<y-x;
  }
}