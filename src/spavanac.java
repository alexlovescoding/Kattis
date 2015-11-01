import java.util.Scanner;

public class spavanac {
	public static void main(String [] args){
		Scanner cat = new Scanner(System.in);
		int hour = cat.nextInt();
		int minutes = cat.nextInt();
		if(minutes-45<0){
			hour = hour - 1;
			if(hour<0){
				hour = 23;
			}
			minutes = 60+(minutes-45);
		}
		else{
			minutes = minutes - 45;
		}
		
		System.out.println(hour + " " + minutes);
	}
}
