/*            :ARRAY:

  --> Array is an Container, its stores group of elements.
 --> Array is Homogeneous in nature.
 --> Array is fixed value.
 --> Array is Index based ,start from [0] index.
 
  1. Array Declaration:L
     int[] a;   or int a[];  or  int  []a;
   
  2. Array Creation:
  
  int[]  a = new int[3];
  int[]  b = new double[2];
  
  3. Array Initialization:
   
   a[1] = 50;
   a[2] = 0.5;
   
   4. Array Declaration and Intiliaztion.
   
   int[] a = { 10,20,30};
   
   length--> a.length-->3
     
 
 */




package com;

public class ArrayPrograms {
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+" --> "+a[i]);
		}
		System.out.println("-----------");
		
		
		
		String[] subjects = { "java","sql","programming","apti"};
		for(int i=0;i<subjects.length;i++)
		{
			System.out.println(i+" --> "+subjects[i]);
		}
		System.out.println("----------");
		
		double[] marks = { 80.5,78.5,60.7};
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(i+"  --> "+marks[i]);
		}
		
		
		
	}

}

/*
ouput:
0 --> 10
1 --> 20
2 --> 30
-----------
0 --> java
1 --> sql
2 --> programming
3 --> apti
----------
0  --> 80.5
1  --> 78.5
2  --> 60.7
 */
