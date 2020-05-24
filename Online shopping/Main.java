#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  std::cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  int x,y,z;
  x=fa-(fa*fd/100) +fs;
  y=sa-(sa*sd/100)+ss;
  z=aa-(aa*ad/100)+as;
  std::cout<<"In Flipkart Rs."<<x<<'\n'<<"In Snapdeal Rs."<<y<<'\n'<<"In Amazon Rs."<<z<<'\n';
  if(x<=y && x<=z)
    std::cout<<"He will prefer Flipkart";
  else if(y<=z)
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
  
}