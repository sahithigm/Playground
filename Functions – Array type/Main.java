#include<iostream>
using namespace std;
int main()
{
    int n;
  std::cout<<"Enter the number of elements in the array"<<"\n";
    cin >> n;
    int arr[n];
  std::cout<<"Enter the elements in the array"<<"\n";
    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int i;
    int odd = 0, even = 0;
    for(i = 0; i < n; i++)
    {
        if(arr[i] % 2 == 1)
            odd++;
        if(arr[i] % 2 == 0)
            even++;
    }
  std::cout <<"The array is ";
    if(odd == n)
        std::cout << "Odd";
    else if(even == n)
        std::cout << "Even";
    else
        std::cout << "Mixed";
    return 0;
}