#include<iostream>
using namespace std;
struct student
{
  char name[100];
  char city[100];
  int est;
  float pass;
};

int main()
{
  int n;
  cout<<"Enter the number of colleges\n";
  cin>>n;
  student stu[n];
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name\n";
    cin>>stu[i].name;
    cout<<"Enter city\n";
	cin>>stu[i].city;
    cout<<"Enter year of establishment\n";
    cin>>stu[i].est;
    cout<<"Enter pass percentage\n";
    cin>>stu[i].pass;
  }
    cout<<"Details of colleges\n";
    for(int i=0;i<n;i++)
    {
      cout<<"College:"<<i+1<<endl;
      cout<<"Name:"<<stu[i].name<<endl;
      cout<<"City:"<<stu[i].city<<endl;
      cout<<"Year of establishment:"<<stu[i].est<<endl;
      cout<<"Pass percentage:"<<stu[i].pass<<endl;
      }
    return 0;
  }
