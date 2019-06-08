package bussinessclass;

public class ReverseNumber {
	
	public static int Reverse(int n){
	    int r=0;
	    int sum=0;
		while(n>0){
	    	r=n%10;
	    	sum=sum*10+r;
	    	n=n/10;
	    }
	
	    	return sum;
		
	}
	public static void main(String[] args){
		int n=213456;
		Reverse(n);
	}
}
