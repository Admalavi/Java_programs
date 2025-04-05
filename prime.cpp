#include<iostream>
using namespace std;
int main()
{
	int n;int flag=1;
	cout<<"enter number:";
	cin>>n;
	
	if(n<2)
	{
		cout<<"it is neither prime nor composite";
	}
	if(n==2)
	{
		cout<<"it is prime";
	}
	
	for(int i=2;i<n;i++)
	{
		if(n% i==0)
		{
			flag=0;
			break;
		}
 }
	
	if(flag)
	{
		cout<<"it is prime";
	}
	else
	{
	cout<<"it is not prime!";
	}
	
	return 0;
}
