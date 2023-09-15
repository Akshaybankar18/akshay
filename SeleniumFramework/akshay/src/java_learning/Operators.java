package java_learning;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//arithmetic operator
		int a=10;  
		int b=5;  
		
		System.out.println(a+b);  
		System.out.println(a-b);  
		System.out.println(a*b);  
		System.out.println(a/b);  
		System.out.println(a%b);
		
		System.out.println(10*10/5+3-1*4/2);
		
		//logical operator
		 boolean x = true;
	     boolean y = false;
	       
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        System.out.println("!x: " + (!x));
		  
		
		// unary operator
		 int a2 = 10;
	     int b2 = 10;
	 
	       
	        System.out.println("Postincrement : " + (a2++));
	        System.out.println("Preincrement : " + (++a2));
	 
	        System.out.println("Postdecrement : " + (b2--));
	        System.out.println("Predecrement : " + (--b2));

         // relational / comparison operator
	        int a3 = 10;
	        int b3 = 3;
	        int c3 = 5;
	 
	        System.out.println("a > b: " + (a3 > b3));
	        System.out.println("a < b: " + (a3 < b3));
	        System.out.println("a >= b: " + (a3 >= b3));
	        System.out.println("a <= b: " + (a3 <= b3));
	        System.out.println("a == c: " + (a3 == c3));
	        System.out.println("a != c: " + (a3 != c3));
	       
	        
	        
	}

}
