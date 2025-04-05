import java.util.Scanner;
class NumberSorting
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

int m=4;
int n=3;
int k;
int j;
int i;
int a[] = new int[m];
int b[] = new int[n];
int c[] = new int[m+n];
System.out.println("Enter the element for array A");
for(i = 0; i<m; i++)
{
a[i] = sc.nextInt();
}
System.out.println("Enter the element for array B");
for(j = 0; j<n; j++)
{
b[j] = sc.nextInt();
}
i = 0; 
j = 0; 
k = 0;

while(i<m && j<n)
{
	if(a[i]<b[j])
	{
	c[k++]=a[i++];
	
	}
	else
	{
	c[k++]=b[j++];
	
	}

}
while(i<m)
{
	c[k++]=a[i++];
	
}
while(j<n)
{
	c[k++]=b[j++];

}
System.out.println("Sorted array is");
for(i=0; i<k; i++)
{
	System.out.println(c[i]);
}
sc.close();
}
}
