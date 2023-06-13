package week1.day2.assignments2;         //Assignment 2

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int a,temp,rem;
		int num=34343;
		temp=num;
			for(a=0;num>0;num/=10)
			{
		    rem=num%10;
			a=(a*10)+rem;
			
		}
			if(a==temp) {
				System.out.println("It is a palindrome number");
			}
			else {
				System.out.println("It is not a palindrome");
			}
		}
	}


