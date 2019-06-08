package bussinessclass;

public class Swap {


	public static int SwapTwo(int a,int b){
	     a=a+b;
		 b=a-b;
		 a=a-b;
	  return 0;

	} 
	public static void main(String[] args) {

		int a=10;
		int b=20;
        
		SwapTwo(a,b);
	}

}
