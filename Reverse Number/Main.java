#include <iostream>
int main() 
{
	int n,d,s=0;
  std::cin>>n;
  while(n>0)
  {
   d=n%10;
    s=s*10+d;
    n=n/10;
  } 
   std::cout<<s; 
	return 0;
}