package homework1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (should match item in both arrays)
		 */
		
		int[] arr1= {3,2,11,4,6,7};
		 int[] arr2= {1,2,8,4,9,7};
		 int count= arr1.length;
		 int[] newarr3=new int[count-1];
		 int n=0;
		 int i,j;
		 
		 for(i=0;i<arr1.length;i++)
		 {
			 for(j=0;j<arr2.length;j++)
			 {
				if(arr1[i]==arr2[j]) 
				{
					newarr3[n]=arr1[i];
					System.out.print(newarr3[n]+" ");
					n++;
				}
			 }
		 }
		 
	}

}
