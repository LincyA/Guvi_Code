import java.io.*;
import java.util.*;
class Vowels
{
public static void main(String[] a)
{ 
System.out.println("Enter a character = ");
Scanner sc = new Scanner(System.in);
char letter= sc.next().charAt(0);
if(letter=='a' || letter=='A' || letter=='e' || letter=='E' ||
        letter=='i' || letter=='I' || letter=='o' || letter=='O' ||
        letter=='u' || letter=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
}}
