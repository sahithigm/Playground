#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int b,r,s,bw;
  cin>>b>>r>>s>>bw;
 float o1=b/6;
  int o2=bw/6;
  int o3=bw%6;
  float f=((float)o2+(float)o3/10);
  float q=r/o1;
  float w=s/f;
  cout<<o1<<'\n';
  cout<<fixed<<setprecision(1)<<f<<'\n';
  cout<<fixed<<setprecision(1)<<w<<'\n';
  cout<<fixed<<setprecision(1)<<q<<'\n';
  if(q<w)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}