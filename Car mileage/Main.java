#include<iostream>
using namespace std;
int main()
{
  float m;
  int p,d;
  std::cin>>m>>p>>d;
  if(m*p -d >0)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}