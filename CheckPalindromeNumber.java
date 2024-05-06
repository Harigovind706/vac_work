import java.util.Scanner;  
//class definition  
public class CheckPalindromeNumber  
{    
//main method  
public static void main(String args[])  
{    
//variables to be used in program  
int r, s=0, temp;      
int x; //It is the number variable to be checked for palindrome    
Scanner sc=new Scanner(System.in);  
System.out.println("Enter the number to check: ");    
//reading a number from the user  
x=sc.nextInt();  
//logic to check if the number id palindrome or not  
temp=x;      
while(x>0)  
{      
r=x%10;  //finds remainder  
s=(s*10)+r;      
x=x/10;      
}      
if(temp==s)      
System.out.println("The given number is palindrome.");      
else      
System.out.println("The given number is not palindrome.");      
}    
}    