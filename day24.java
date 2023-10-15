import java.util.Scanner;
class Day24{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter the num");
int n=sc.nextInt();
int a=0;
int num=2;
for(int i=0;i<n;i++)

{
a+=num;
num=num*10+2;
}
//for(int j=0 ;j<=i;j++)
//{
System.out.println("the sum of Series:"+a);
}
}

