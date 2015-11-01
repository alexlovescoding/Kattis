import java.util.Scanner;

public class grille {
	public static void main(String[] args) {
		Scanner cat = new Scanner(System.in);
		int size = cat.nextInt();
		cat.nextLine();
		char[][] crypt = new char[size][size];
		char[][] decrypt = new char[size][size];
		boolean isInvalid = false;

		String output = "";
		for (int i = 0; i < size; i++) {
			crypt[i] = cat.nextLine().toCharArray();
		}
		String input = cat.nextLine();
		int counter = 0;
		outerLoop: for (int i = 0; i < 4; i++) {
			for (int j = 0; j < size; j++) {
				for (int k = 0; k < size; k++) {
					if (crypt[j][k] == '.') {
						if (decrypt[j][k] != 0) {
							isInvalid = true;
							break outerLoop;
						} else {
							decrypt[j][k] = input.charAt(counter);
							counter++;
						}
					}
				}
			}
			crypt = rotate(crypt, size);
		}
		if (!isInvalid) {
			outerLoop: for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (decrypt[i][j] == 0) {
						isInvalid = true;
						break outerLoop;
					} else {
						output = output + decrypt[i][j];
					}
				}
			}
			if (!isInvalid) {
				System.out.println(output);
			} else {
				System.out.println("invalid grille");
			}
		} else {
			System.out.println("invalid grille");
		}
	}

	public static char[][] rotate(char array[][], int size) {
		char[][] newArray = new char[size][size];
		for (int i = 0; i < size; i++) {
			int counter = 0;
			for (int j = size - 1; j >= 0; j--) {
				newArray[i][counter] = array[j][i];
				counter++;
			}
		}
		return newArray;
	}
}
