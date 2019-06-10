package bussinessclass;

public class Prime {

      public static boolean Prime(int a){
    int m=a/2;
    int q=0;
    	if(a==0||a==1||a<0){
    		  return false;
    	}else {
    		for(int i=2;i<= m;i++){
    			if(a%i==0){
    		
    				 q=1;
    				break;
    				
    			}return false;
    			
    		}
    		if(q==0){
    			return true;
    		}
    		
    	}
    	return true;
    	
    }
	
	public static void main(String[] args) {
        int a=10;
    	
        Prime(a);
	}

}
