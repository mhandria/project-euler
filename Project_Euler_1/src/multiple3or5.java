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
		int ans = findMultiplesSum(5, 999) + findMultiplesSum(3, 999) - findMultiplesSum(15, 999);
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
		int l = (a/d)*d;
		int N = ((l-d)/d)+1;
		int sum = N*(l+d)/2;
		return sum;
	}

}


