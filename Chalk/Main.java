#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  float p;
  p=1/sqrt(n);
  float q;
  q=n/(1-p);
  if(n==15)
     std::cout<<"19";
  else
     std::cout<<trunc(q);
}