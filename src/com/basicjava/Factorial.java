package com.basicjava;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = read.nextInt();
		int factorial = fact(num);
		
		System.out.println("Factorial of entered number is"+factorial);
		
	}
  static int fact(int n)
  {
	  int output;
	  if(n==1)
	  {
		  return 1;
	  }
	  output = fact(n-1)*n;
	  return output;
  }
}
