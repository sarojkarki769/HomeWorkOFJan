package JanHomeWork;

public class JanHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
	
	//  Arithmetic Operators +, -, *, /, %
		
		int a = 4;
		int b = 8;
		int c = 12;
		int d = 14;
		
		int e1 = a+b;     
		int e2 = a-b;
//		//int e3 = b*c;
		double e4 = (double) d/a; 
//		//int e5 = c%b;
		
		System.out.println("The Additiion of a and b = " + e1);             // 12
		System.out.println("The Substrac of a and b = " + e2);              // -4
		System.out.println("The Multiplication b and c = " +(b*c));        // 96
		System.out.println("The Division of d and a = " + e4);          // 3.5
		System.out.println("The Modula of c and b = " + (c%b));            // 4
		
				int m = 4;
				int n= 5;
				
//	++n; // pre increment			
//    n++; // post increment			
				
				m = ++n;
				
				System.out.println("The increment value of m = " + m );
				
	}
				
		//     Relation Operator  ==, !=, <, >, <=, >= 
		
		{
			
			int m =6;
			int n =5;
			boolean b = m>n;
			boolean c = m<n;
			boolean d = m<=n;
			boolean e = m>=n;
			boolean f = m!=n;
		    boolean g = m==n;
		    
			System.out.println("The value of b is  " + b);
			System.out.println("The value of c is  " + c);
			System.out.println("The value of d is  " + d); 
			System.out.println("The value of e is  " + e);
			System.out.println("The value of f is  " + f); 
			System.out.println("The value of g is  " + g); 
			
			if(m==n)
				System.out.println("This is  " + true);
			else
			System.out.println("This is  " + false);
		}
		
		{

			
			/// Logical Operator &&, ||, !&&
		
			
			int v = 3;
		   	int x = 4;
			 int y = 6;
			 int z = 8;
			 
			 boolean BooleanResults1 = ((v==x)&&(y==z));
			 boolean BooleanResults2 = ((v==x)||(x==y));
			 boolean BooleanResults3 = !((y==v)&&(z==v));
			 
			 
			 System.out.println("The Boolean value of BooleanResults1 is " + BooleanResults1);
			 System.out.println("The Boolean value of BooleanResults2 is " + BooleanResults2);
			 System.out.println("The Boolean value of BooleanResults3 is " + BooleanResults3);

		}
		
		{
///// The Assignment Operators  =, +=, -=, *=, /=, %=, <<=, >>=,  &=, ^=, |=
			
			int salary = 5000;
			int promo = 2000;
			
			
//			  salary = salary + promo;  
				
//					OR
					
			salary += promo;
			System.out.println("The total salary is " + salary);
			
			
			salary -= promo;  // (Total salary is 7000 but without promo=500)
			
			
			System.out.println("The total salary is " + salary);
			
			salary /= salary;
			
			System.out.println(salary);
			
			salary *= salary;
			System.out.println(salary);
			
		}
		
		{
	int m = 4;
	int n= 30;
	int o = 40;
	
	m = m % o;
	System.out.println(m);
			
	 m = n<<=m;
	System.out.println(m);
	
	o = n^=o;
	
	System.out.println(o);
		}
	
	
	}

}
