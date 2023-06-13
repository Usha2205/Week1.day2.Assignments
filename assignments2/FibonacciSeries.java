package week1.day2.assignments2;      //Assignment 4

public class FibonacciSeries{

	public static void main(String[] args) {
		int range=8;
		int firstNo=0;
		int secondNo=1;
		int sum;
		
		System.out.println(firstNo);//Print the first number 
		System.out.println(secondNo);//"Print the second number 
		
		for (int i= 2; i<range; i++)
		{
			sum=firstNo+secondNo;
			System.out.println(sum);//print the sum
			firstNo=secondNo;
			secondNo=sum;
			
		}
		
	}

}
