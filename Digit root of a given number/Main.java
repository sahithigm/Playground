#include <iostream>
using namespace std;

int main() 
{
	int n;
	std::cin>>n;
	int res;

	if(n)
		res = n % 9 == 0 ? 9 : n % 9 ;
	else 
		res = 0;
	cout<<res;

	return 0;
}