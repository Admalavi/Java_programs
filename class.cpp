#include<iostream>
using namespace std;
class student
	{
		public:
			string name;
			int rollno;
		 void	getdata()
			{
				cout<<"enter the name: ";
				cin>>name;
				cout<<"enter the roll no: ";
				cin>>rollno;
			}
			void displaydata()
			{
				cout<<"name is:"<<name<<endl;
				cout<<"rollno is:"<<rollno;
			}
};
int main()
{
	student s[5];
	
	for(int i=0;i<5;i++)
	{
		cout<<"enter details of student"<<endl;
		s[i].getdata();
	}
	
	int choice;
	cout<<"enter student whos information you want:"<<endl;
	cin>>choice;
	
	if(choice>=0 && choice<5)
	{
		cout<<"enter student details:"<<endl;
		s[choice-1].displaydata();
	}
	else
	{
		cout<<"enter valid details";
	}
	
	
	return 0;
}
