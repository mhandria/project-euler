/*	name: 			Michael Handria
 * 
 *	date: 			July 12, 2016
 *
 *	description: 	This program will solve the first problem from 
 *					Project Euler's website: https://projecteuler.net/problem=2.
 *					This program uses the most optimal way I could find to solve it.
 * 
 */

public class fibsum {
	
	
	public static void main(String[] args){
		
		//check if hit the 4,000,000 mark
		boolean notMil = true;
		
		//iterator
		int i = 0;
		
		//find the sum of the fib sequence of even numbers
		long fibSum = 0;
		
		//loop to calculate the sum
		do{
			
			//increment the iterator by 3 to get only the even fib values
			i+=3;
			
			//summation 
			fibSum = fibSum + (long)findFib(i);
			
			//check if the digit 
			if(findFib(i+3)>=4000000)
				notMil = false;
				
		}while(notMil);
		
		//display answer
		System.out.println(fibSum);
	}
	
	/**
	 * this will find the Fibonacci number of the nth term
	 * using Binet's formula
	 * @param n		nth term in the sequence of Fibonacci
	 * @return		Fibonacci value of nth term
	 */
	public static double findFib(int n){
		
		//calculate for phi (the golden ratio)
		double phi = (1 + Math.sqrt(5))/2;
		
		//calculate for negative phi
		double nphi = (1 - Math.sqrt(5))/2;
		
		//solve for the fibonacci 
		double fib = Math.pow(phi, n) - Math.pow(nphi, n);
		
		//return the fibonacci value
		return (fib/Math.sqrt(5));
	}

}
