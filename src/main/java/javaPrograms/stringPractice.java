package javaPrograms;

public class stringPractice {

	public static void main(String[] args) {
	
	String	b= "Mamgain";
	String	a= "abhishek Mamgain";
	int l=a.length();
	System.out.println(l);
	System.out.println(b);
	System.out.println(a.equals(b));	// equals method compares content not length
	System.out.println(a.equalsIgnoreCase(b)); 		//it compares but ignore case sensitiveness
	
	System.out.println(a.contains(b));			//check one string present in another or not and print it
	
	System.out.println(a.charAt(7));			// which character is present under the string in the mentioned numeric place example - - 7th place
	
	String c= b+b+a;					//to add the string and print
	System.out.println(c);
	
	
	
	}
}
