#include<stdio.h>
#include<iostream>
int main()
{
  int m,n,s=0,i;
  std::cin>>m>>n;
  for(i=1;i<(m+n);i++)
  {
    if((m+n)%i==0)
    {
      s=s+i;      
    }
  }
  if(s==(m+n))
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}