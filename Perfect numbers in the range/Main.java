#include<iostream>
int main()
{
   int a,b;
  std::cin>>a>>b;
  int i,s,j;
  for(i=a;i<=b;i++)
  {
    j=1; 
    s=0;
    while(j<i)
    {
      if(i%j==0)
        s=s+j;
      j++;
    }
    if(s==i)
      std::cout<<i<<" ";
    }
  
}