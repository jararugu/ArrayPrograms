package com;

public class EmpSolution {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10,"guru");
		Employee e2 = new Employee(20,"raja");
		Employee e3 = new Employee(30,"kumar");
		
		Employee[] e = {e1,e2,e3};
		for(int i=0;i<e.length;i++)
		{
			System.out.println("id: "+e[i].id+"  name: "+e[i].name);
		}
	}

}




/*output:
 id: 10  name: guru
id: 20  name: raja
id: 30  name: kumar
*/
