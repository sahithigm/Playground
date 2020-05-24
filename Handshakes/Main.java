#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int i,s=0;
  for(i=0;i<n;i++)
  {
   s=s+i; 
  }
  std::cout<<s;
}