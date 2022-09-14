//@author Akash Singh

public class String_Activity {
	
	public static void main(String[] args) {
		String s= "Welcome to Java World";
		char s1=s.charAt(5);//charAt method to take character of 5th position or index
		System.out.println("character of 5th position is:"+s1);//printing 5th index character
		System.out.println("compare:"+s.compareTo("Welcome"));//comparing
		String s2=s.concat("- Let us learn");//Concatenates the specified string to the end of this string. 
		System.out.println("After concat result:"+s2);//printing after concat
		System.out.println("1st occurance index of a:"+s2.indexOf('a'));//1st occurrence of "a"
		String s3=s2.replace('a', 'e');//replace a to e
		System.out.println("Replacing 'a' to 'e':"+s3);//printing replaced string
		System.out.println("string between 4-10 index:"+s.substring(4, 11));//string between 4 to 10 index
		System.out.println("lowercase:"+s2.toLowerCase());//converting to small letter
			
		//problem statement2
	StringBuffer sb=new StringBuffer("This is StringBuffer");//declaring StringBuffer
	sb.append("- This is a sample program");//adding new string after old string
	System.out.println(sb);
	sb.insert(21, "Object");//inserting in 21th index
	System.out.println(sb);
	sb.replace(14, 20, "Builder");//replacing 14 to 19 index
	System.out.println(sb);
	sb.reverse();//reverse the string
	System.out.println(sb);
	
		//problem statement3
		
		StringBuilder sd=new StringBuilder("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");//declaring stringBuilder
		System.out.println("Drive:"+sd.substring(0, 3));//string of 0 to 2 index
		//using substring and concat method to get the result
		System.out.println("Folders:"+sd.substring(3, 6).concat(" || ")+sd.substring(7,10).concat(" || ")+
				sd.substring(11,18));
		System.out.println("File:"+sd.substring(20));//print string after 20no. index	
	}
}
