import java.util.Scanner;

public class conundrum {
	public static void main(String[] args) {
		Scanner cat = new Scanner(System.in);
		String input = cat.nextLine();
		char [] inputChar = input.toCharArray();
		int count = 0;
		int change = 0;
		for(char i:inputChar){
			if((count%3==0 && i!='P')
					||(count%3==1 && i!='E')
					||(count%3==2 && i!='R')){
				change ++;
			}
			count++;
		}
		System.out.println(change);
	}
}
