package bussinessclass;

import java.util.Arrays;

public class Compare {

	public static boolean CompareArry(int a[],int b[]){
		boolean array=true;
		try{
			if(Arrays.equals(a,b)){
			
			   array=true;
		}	else{
			
	             array= false;
		}}
			catch(NullPointerException e){
				System.out.println("null ponter exception");
				
			}return array;
		}


	public static void main(String[] args) {
		int a[]={1,2,3};
		int b[]={1,2,3,4};
		CompareArry(a,b);
	}

}
