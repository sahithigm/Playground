#include<iostream>
int main()
{
  int n,i,h;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  h=a[0];
  for(i=0;i<n;i++)
  {
    if(h<a[i])
      h=a[i];
    else
      h=h;
  }
  std::cout<<h;
}