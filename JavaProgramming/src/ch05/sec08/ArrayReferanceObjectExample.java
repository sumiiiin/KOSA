package ch05.sec08;

public class ArrayReferanceObjectExample {
	public static void main(String[] args) {
		
		String[] languages = new String[3];
		languages[0] = "Java";
		languages[1] = "Java";
		languages[2] = new String("Java");

		System.out.println(languages[0] == languages[1]); //ture
		System.out.println(languages[0] == languages[2]); //false
		System.out.println(languages[0].equals(languages[2])); //ture
	}

}
