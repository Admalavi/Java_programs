#include<iostream>
using namespace std;
int main()
{
	int a,b,c;
	cout<<"enter value of a:";
	cin>>a;
	cout<<"enter value of b:";
	cin>>b;
	cout<<"enter value of c:";
	cin>>c;
	if(a>b&&a>c)
	{
		cout<<"a is greater";
	}
	else if(b>a&&b>c)
	{
		cout<<"b is greater";
	}
	else{
		cout<<"c is greater";
	}
	return 0;
}
