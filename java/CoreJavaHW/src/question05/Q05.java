package question05;

/*
 * Q5. Write a substring method that accepts a string str and an integer idx
 * and returns the substring contained between 0 and idx-1 inclusive.
 * Do NOT use any of the existing substring methods in the String, StringBuilder,
 * or StringBuffer APIs.
 */
public class Q05 {

	public static void main(String[] args) {
		String s = "Hello my name is rex.";
		System.out.println(substring(s, 4));
	}
	static String substring(String str, int idx) {
		String temp = "";
		for(int i = 0; i <= idx; i++) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}
}
