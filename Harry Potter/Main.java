#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int x,y;
  x=(n/1000);
  y=n%10;
  std::cout<<x+y;
}