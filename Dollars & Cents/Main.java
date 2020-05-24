#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c>>d;
  int de=a+c;
  int ce=b+d;
  while(ce>100)
  {
    ce=ce-100;
    de =de+1;
    break;
  }
  std::cout<<de<<'\n'<<ce;
}