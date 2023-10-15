import java.util.Scanner;  
class Parrten4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int row = sc.nextInt();
int col = sc.nextInt();
int counter=row*col;
for( int i=1;i<=row;i++)
{
for(int j=1;j<=col;j++)
{
System.out.print(counter+"");
counter--;
}
System.out.println();
}
}
}