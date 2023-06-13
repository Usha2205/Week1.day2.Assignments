package week1.day2.assignments2;  //Assignment 1

public class PrimeNumber {
 
	public static void main(String[] args) {
		int val=13;
		boolean flag=false;

		for (int i = 2; i<=val/2; i++) {
			if(val%i==0) {

				flag=true;
				break;
			}
		}

		if(!flag) {
			System.out.println( "It is a Prime Number :" +val);
		}
		else {
			System.out.println("It is a not a Prime Number :"+val);
		}
	}
}


