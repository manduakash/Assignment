//@author Akash Singh
public class Question_no1 {	//class

	public static void main(String[] args){	//main method
		try{//creating objects without new keyword
		
		//creating objects using newInstance method
		AnotherClass o1 = AnotherClass.class.newInstance();
		AnotherClass o2 = AnotherClass.class.newInstance();
		AnotherClass o3 = AnotherClass.class.newInstance();
		AnotherClass o4 = AnotherClass.class.newInstance();
		AnotherClass o5 = AnotherClass.class.newInstance();
		
		//initializing data members of objects
		o1.name="akash";
		o1.age=23;
		o2.name="sayan";
		o2.age=24;
		o3.name="sankha";
		o3.age=25;
		o4.name="owashim";
		o4.age=26;
		o5.name="arnab";
		o5.age=27;
		
		System.out.println("name="+o1.name+", age="+o1.age);
		System.out.println("name="+o2.name+", age="+o2.age);
		System.out.println("name="+o3.name+", age="+o3.age);
		System.out.println("name="+o4.name+", age="+o4.age);
		System.out.println("name="+o5.name+", age="+o5.age);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
class AnotherClass{	//another class
	//data members of another class
	String name;
	int age;
}
