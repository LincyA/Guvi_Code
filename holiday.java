import java.io.*;
import java.util.*;
class holiday
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
String day=sc.nextLine();
day=day.toLowerCase();
if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday")||day.equals("saturday"))
{
System.out.println("false");
}
else if(day.equals("sunday"))
{
System.out.println("true");
}
}
}
