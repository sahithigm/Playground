#include<iostream>
using namespace std;
int main()
{
  int n;
  float m;
  std::cin>>n>>m;
  float l,k=n*m;
  l=((m/100)*50);
  if(n<=2)
    std::cout<<k-l;
  else if(n==3)
    std::cout<<2*m;
  else
    std::cout<<"Number of items is more";
}