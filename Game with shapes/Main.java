#include<iostream>
using namespace std;
int main()
{
  int l,r;
  std::cin>>l>>r;
  if((2*l)==r)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
}