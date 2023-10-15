import java.util.Scanner;
class Revers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int n=sc.nextInt();
int a=0;
for(int i=1;i<=n;i++)
{
a=a*10+n%10;
n=n/10;
}
System.out.println(a);
}
}
