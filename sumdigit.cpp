#include<iostream>
using namespace std;
int main(){
	int n;
	int sum=0;
	cout<<"enter number:";
	cin>>n;
	for(;n>0;n=n/10)
	{
		sum=sum+(n%10);
	}
	cout<<"sum of digits is:"<<sum;
	return 0;
}
