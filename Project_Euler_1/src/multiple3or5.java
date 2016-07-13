/*	name: 			Michael Handria
 * 
 *	date: 			July 11, 2016
 *
 *	description: 	This program will solve the first problem from 
 *					Project Euler's website: https://projecteuler.net/problem=1.
 *					This program uses the most optimal way I could find to solve it.
 * 
 */

public class multiple3or5 {
	public static void main(String[] args){
		
		//find the summation of multiple of 3 and 5 added together and subtract repeats
		int ans = findMultiplesSum(5, 999) + findMultiplesSum(3, 999) - findMultiplesSum(15, 999);
		
		//print the answer out
		System.out.println(ans);
	}
	
	/**
	 * this finds the collective
	 * multiples sum of the largest to the lowest
	 * @param d	 multiple or sequence pattern
	 * @param a	 highest number
	 * @return	 result of sum
	 */
	public static int findMultiplesSum(int d, int a){
		
		//find the largest number in the sequence
		int l = (a/d)*d;
		
		//find the number of term in the sequence
		int N = ((l-d)/d)+1;
		
		//find the summation of the sequence
		int sum = N*(l+d)/2;
		
		//return the sum of the sequence
		return sum;
	}

}


