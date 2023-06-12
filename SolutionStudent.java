package com;

public class SolutionStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(80);
		Student s2 = new Student(90);
		Student s3 = new Student(70);
		
		Student[] s = { s1,s2,s3};
			for(int i=0;i<s.length;i++)
			{
				//System.out.println(s[i]); it will prints object address.
				System.out.println("marks-->"+s[i].marks);
			}
	}

}
/* output:

 
marks-->80
marks-->90
marks-->70
*/