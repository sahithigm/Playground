#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  int l,m,n,o,p;
  l=b*2;
  m=b*3;
  n=b*4;
  o=b*5;
  p=a*2;
  if(c>=1 && c<=a)
    std::cout<<"Yes";
  else if(c==a || c==m ||c==n||c==l ||c==0)
    std::cout<<"Yes";
  else if(c==a+1||c==l+1||c==m+1||c==n+1||c==o+1)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}