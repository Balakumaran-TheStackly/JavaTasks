package day2;

public class Task_4 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		
		sb.append("Bala");  //add String
		System.out.println(sb);
		
		//insert
		System.out.println(sb.insert(5, " "));
		
		//Delete
		System.out.println(sb.delete(0, 6));
		
		//Reverse
		System.out.println(sb.reverse());
		
		//replace
		System.out.println(sb.replace(0, 4, "Kumaran"));
		
		System.out.println("String Builder");
		
		//String builder
		StringBuilder sb1=new StringBuilder("welcome");
		
		sb1.append("Home");
		System.out.println(sb1);
		//insert
		System.out.println(sb1.insert(7, " "));
				
		//Delete
		System.out.println(sb1.delete(0, 8));
				
		//Reverse
		System.out.println(sb1.reverse());
				
		//replace
		System.out.println(sb1.replace(0, 4, "Bala"));
		
		
		
	}
}
