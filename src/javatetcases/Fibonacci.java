package javatetcases;

public class Fibonacci {

	
		static int a=0,b=1,c=0;
		public static int FibonacciSeries(int count){
	       
			if(count<=0){
				System.out.println("given number is leshan or equal to zero");
				return 0;
			}
				
			else{
				for(int i=1;i<=count;i++){
			         
		       	     c=a+b;
			         b=a;
			         a=c;
			       
			       }
			return a;
			} 
		}

		public static void main(String[] args) {
			int count=5;
				FibonacciSeries(count);
		}

	}

