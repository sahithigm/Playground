#include<iostream>
using namespace std;
struct employee
{
  int id;
  char name[25];
  int age;
  char des[25];
  long sal;
};
int main()
{
  employee e;
  cout<<"Enter name: ";
  cin>>e.name;
  cout<<"\nEnter ID: ";
  cin>>e.id;
  cout<<"\nEnter age: ";
  cin>>e.age;
  cout<<"\nEnter designation: ";
  cin>>e.des;
  cout<<"\nEnter Salary: ";
  cin>>e.sal;
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.id;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.des;
  cout<<"\nSalary of the Employee : "<<e.sal;
}