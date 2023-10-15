import java.util.Scanner;
 class Sumodd{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the value ");
int n = sc.nextInt();
int sum=0;
for (int i=0;i<=n;i++)
{
if (i%2!=0)
{
System.out.println(i);

sum=sum+i;
}
}
System.out.println("sum is="+sum);
}
}
