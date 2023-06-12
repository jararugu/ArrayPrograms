/*  Write a java Program to find the sum and Avg of N array of elements
 * 
 */
package com;
public class LogicProgram {
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];  // sum += a[i];
		}
		System.out.println("sum:" +sum);
		System.out.println("Avg:"  +sum/a.length);
	}

}

/* output:

sum:60
Avg:20
*/