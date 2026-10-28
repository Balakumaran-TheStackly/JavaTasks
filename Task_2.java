package task;

public class Task_2 {
	public static void main(String[] args) {

        String str = "Hello Java";
        String str2 = "hello World";
        String str3 = "   Hello Java   ";

        System.out.println("1. Lowercase: " + str.toLowerCase());
        System.out.println("2. Uppercase: " + str.toUpperCase());
        System.out.println("3. Equals: " + str.equals(str2));
        System.out.println("4. Equals Ignore Case: "+ str.equalsIgnoreCase(str2));
        System.out.println("5. Length: " + str.length());
        System.out.println("6. Character at index 1: " + str.charAt(1));
        System.out.println("7. Substring: " + str.substring(6));
        System.out.println("8. Contains Java: " + str.contains("Java"));
        System.out.println("9. Starts with Hello: " + str.startsWith("Hello"));
        System.out.println("10. Ends with Java: " + str.endsWith("Java"));
        System.out.println("11. Replace: " + str.replace("Java", "World"));
        System.out.println("12. Trim: '" + str3.trim() + "'");
        System.out.println("13. Concatenation: " + str.concat(" Programming"));
        System.out.println("14. Index of Java: " + str.indexOf("Java"));
        System.out.println("15. Is empty: " + str.isEmpty());
    }
}
