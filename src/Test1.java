
public class Test1 {
	    public static void Main(String[] args) {
	        // write your code in Java SE 8
	    	String S="Diana";
	        int l=S.length();
	        System.out.println(l);
	        for (int i=1;i<=l-1;i++)
	        {
	        	for(int j=i+1;j<=l-i;j++)
	            {
	            if (S.charAt(i)==S.charAt(j))
	            	{System.out.println(S.charAt(i));}
	            }
	        }
	    }
}
