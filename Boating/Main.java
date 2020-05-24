#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  int x,y;
  x=b*75+c*30;
  y=a-x;
  if(y>0)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}