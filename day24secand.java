import java.util.Scanner;
class Day24Secand{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
sum+=i*i;
}
System.out.println("sum of the square:"+sum);
}
}

