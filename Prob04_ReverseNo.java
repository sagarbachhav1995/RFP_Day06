import java.util.Scanner;

public class Prob04_ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,reverse=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number To Reverse:");
		number=sc.nextInt();
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}
