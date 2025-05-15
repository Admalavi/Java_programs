#include<iostream>
using namespace std;
int main()
{
	int a[10],temp;
	cout<<"enter 10 numbers:";
	for(int i=0;i<10;i++)
	{
		cin>>a[10];
 }
	for(int i=0;i<10;i++)
	 {
		for(int j=i+1;j<10;j++)
		 {
			if(a[i]>a[j])
			 {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			 }
		 }
	 }
 
 cout<<"sorted numbers are:";
 for(int i=0;i<10;i++)
 {
 	cout<<a[i]<<" ";
	}
	cout<<endl;
	return 0;
}
