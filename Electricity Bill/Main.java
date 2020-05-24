#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"Rs.";
  if(n<=200)
    std::cout<<(n*5)/10;
  else if(n<=400)
    std::cout<<(n*0.65)+100;
  else if(n<=600)
    std::cout<<(n*1.25)+425;
}