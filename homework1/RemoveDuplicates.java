package homework1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		String text = "We learn java basics as part of java sessions in java week1";		
		int count=0;
		String[] text1= text.split(" ");
		System.out.println(text1.length);
		for(int i=0;i<=text1.length-1;i++) 
		{ count=0;
			for(int j=0;j<=text1.length-1;j++)
			{
				//System.out.println("Text of text[i]"+i);
				//System.out.println(text1[i]);
				//System.out.println("Text of text[j]"+j);
				//System.out.println(text1[j]);
				
				if(text1[i].equals(text1[j])) 
				{	count++;
				System.out.println("Count incremented");
				}
			}	
			
			if(count>1) 
			{
				System.out.println("Count>1"+text1[i]);
				text1[i]=text1[i].replace(text1[i], "");
			}
				
		}
		for(int i=0;i<=text1.length-1;i++) 
		{ 
			System.out.print(text1[i]+" ");	
			
		}
		
	
	}

}
