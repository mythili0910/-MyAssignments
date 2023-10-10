package work.oct10;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetClassroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="google";
char[] chArr=s.toCharArray();
System.out.println(chArr);

Set<Character> uniqCharSet=new LinkedHashSet<Character>();
Set<Character> dupChar=new LinkedHashSet<Character>();

for(int i=0;i<chArr.length;i++)
{
	boolean add= uniqCharSet.add(chArr[i]);
	if(!add)
		dupChar.add(chArr[i]);

}
System.out.println("Unigue Characters in string google");
System.out.print(uniqCharSet);
System.out.println();
System.out.println("Duplicate Characters in string google");
System.out.print(dupChar);





	}

}
