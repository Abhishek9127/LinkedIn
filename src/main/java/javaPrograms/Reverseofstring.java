package javaPrograms;

public class Reverseofstring {

	public static void main(String[] args) {

		String a = "AbhiAnnu";
		String rev = "";
		int l = a.length();

		for (int i = l - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);

		}
		System.out.println(rev);
	}
}
