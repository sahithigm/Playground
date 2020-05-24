#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  if((r+c==t)||((r+c)*2)==t)
    cout<<"It is a mango tree";
   else
     cout<<"It is not a mango tree";
}