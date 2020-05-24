#include<iostream>
int main(){
  int n,i,f=1;
  std::cin>>n;
  for(i=n;i>0;i--)
  {
    f=f*i;
  }
 std:: cout<<f;
}