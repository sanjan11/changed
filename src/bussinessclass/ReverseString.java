package bussinessclass;

public class ReverseString {

		public static String Reverse(String s){
			
			for(int i=s.length()-1;i>=0;i--){
				String rev=" ";
				rev=rev+s.charAt(i);
			
			}
			return s;
		}
		
		public static void main(String[] args) {
			String s="sanjan";
			
			Reverse(s);
		}

	}
