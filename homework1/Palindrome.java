package homework1;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
String s1="Nalan";
String rev="";
System.out.println("The Original string of characters: "+s1);
System.out.println("The reverese string of characters: ");
for(int i=s1.length()-1;i>=0;i--)

	{
	System.out.print(s1.charAt(i));
	rev=rev+s1.charAt(i);
	}
System.out.println("");

if(s1.equalsIgnoreCase(rev))
	System.out.println("Its a Palindrome");
else
System.out.println("Not a Palindrome");

	}
	
	}


