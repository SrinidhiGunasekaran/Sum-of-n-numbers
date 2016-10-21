import java.util.*;
class Sum
{
public static void main(String args[])
{
int num,i,sum=0;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
if(num>0)
{
for(i=1;i<=num;i++)
{
sum+=i;
}
System.out.println("Sum is:"+sum);
}
else
{
System.out.println("Invalid data");
}
}
}
