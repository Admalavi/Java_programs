#include<iostream>
using namespace std;
int main()
{
	int a,b;
	int result;
	
	cout<<"enter value of a:";
	cin>>a;
	cout<<"enter value of b:";
	cin>>b;
	
	do{
	
	cout<<"eneter 1 for addition"<<endl;
	cout<<"enter 2 for subtrcation"<<endl;
	cout<<"enter 3 for multiplication"<<endl;
	cout<<"enetr 4 for division"<<endl;
	cout<<"enter 5 for module"<<endl;
	cout<<"enter 6 for exit"<<endl;
	cout<<"enter your choice:";
	cin>>result;
	
	switch (result){
	
		case 1:
			{
		cout<<"addtion is:"<<(a+b)<<endl;
		break;
	  }
		case 2:
			{
		cout<<"substraction is:"<<(a-b)<<endl;
		break;
	  }
		case 3:
			{
		cout<<"multiplication is:"<<(a*b)<<endl;
		break;
		 }
		case 4:
			{
		cout<<"division is:"<<(a/b)<<endl;
		break;
		 }
		 case 5:
		 	{
		 		cout<<"modulus is:"<<(a%b)<<endl;
				}
		 case 6:
		 {
		 	cout<<"exit"<<endl;
		 	break;
		 }
		default:
			{
		cout<<"invalid operation"<<endl;
		 }
		
}
}while(result!=6);
return 0;
}
