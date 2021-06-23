package twoPointers;

public class ReverseVowelsInString {
	
	private static void reverseVowel(String s) {
		  int i=0;
	        int j=s.length()-1;
	        StringBuilder sb = new StringBuilder(s);
	        
	        while(i < j){
	            
	            if((sb.charAt(i) != 'a') && (sb.charAt(i) != 'e') && (sb.charAt(i) != 'i') 
	               && (sb.charAt(i) != 'o') && (sb.charAt(i) != 'u')  ||  (sb.charAt(i) != 'A') && (sb.charAt(i) != 'E') && (sb.charAt(i) != 'I') 
	               && (sb.charAt(i) != 'O') && (sb.charAt(i) != 'U')){
	            	
	            	System.out.println(sb.charAt(i));
	                i++;
	            }
	            if((sb.charAt(j) != 'a') && (sb.charAt(j) != 'e') && (sb.charAt(j) != 'i') 
	 	               && (sb.charAt(j) != 'o') && (sb.charAt(j) != 'u') || (sb.charAt(i) != 'A') && (sb.charAt(i) != 'E') && (sb.charAt(i) != 'I') 
		               && (sb.charAt(i) != 'O') && (sb.charAt(i) != 'U')){
	                j--;
	            } 
	           if((sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' 
	 	               || sb.charAt(i) == 'o' || sb.charAt(i) == 'u') && (sb.charAt(j) == 'a' || sb.charAt(j) == 'e' || sb.charAt(j) == 'i' ||
	                    sb.charAt(j) == 'o'  || sb.charAt(j) == 'u') || (sb.charAt(i) != 'A') && (sb.charAt(i) != 'E') && (sb.charAt(i) != 'I') 
		               && (sb.charAt(i) != 'O') && (sb.charAt(i) != 'U')){
	                char ch = sb.charAt(i);
	                sb.setCharAt(i, sb.charAt(j));
	                sb.setCharAt(j, ch);
	                i++;
	                j--;
	            }
	            
	            System.out.println("i is"+" "+i+" "+j);
	        }
	        System.out.println(sb.toString());
		
	}

	public static void main(String[] args) {
		 String s ="aA";
		 reverseVowel(s);

	}
}
