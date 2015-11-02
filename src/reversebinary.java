import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reversebinary {
	public static void main(String[] args) {
		Scanner cat = new Scanner(System.in);
		String num = Integer.toBinaryString(cat.nextInt());
		cat.close();
		char[] numArray = num.toCharArray();
		ArrayList<Character> binary = new ArrayList<Character>();
		for(char numChar : numArray){
			binary.add(numChar);
		}
		Collections.reverse(binary);
		int counter = 0;
		for(Character numChar: binary){
			numArray[counter] = numChar;
			counter++;
		}
		System.out.println(Integer.parseInt(String.valueOf(numArray), 2));
	}
}
