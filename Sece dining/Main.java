#include<iostream>
using namespace std;
int main()
{
  string s;
  int n;
  std::cin>>s>>n;
  if(s.compare("front")==0)
  {
    if(n==1)
      std::cout<<"Left Handed";
    else
      std::cout<<"Right Handed";
  }
  else
  {
    if(n==1)
      std::cout<<"Right Handed";
    else
      std::cout<<"Left Handed";
  }
}