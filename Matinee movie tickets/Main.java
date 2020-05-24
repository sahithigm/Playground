#include<iostream>
using namespace std;
int main()
{
  int a;
  float t;
  std::cin>>a>>t;
  if(t<=10.15)
  {
    if(a>=13)
      std::cout<<"$8.00";
    else
      std::cout<<"$4.00";
  }
  else 
  {
    if(a>=13)
      std::cout<<"$5.00";
    else
      std::cout<<"$2.00";
  }
}