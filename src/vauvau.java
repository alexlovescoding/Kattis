import java.util.Scanner;

public class vauvau {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        
        // The dogs' aggressive/calm cycles
        int dog1Aggressive = cat.nextInt();
        int dog1Calm = cat.nextInt();
        int dog2Aggressive = cat.nextInt();
        int dog2Calm = cat.nextInt();
        
        // The times the people visit house 18
        int [] visitTimes = new int[3];
        for (int i = 0; i < 3; i++) {
            visitTimes[i] = cat.nextInt();
        }
        
        for (int visitTime : visitTimes) {
            boolean dog1 = attack(dog1Aggressive, dog1Calm, visitTime);
            boolean dog2 = attack(dog2Aggressive, dog2Calm, visitTime);
            if (dog1 && dog2) {
                System.out.println("both");
            }
            else if (dog1 || dog2) {
                System.out.println("one");
            }
            else {
                System.out.println("none");
            }
        }
        
    }
    
    public static boolean attack(int aggressive, int calm, int visitTime) {
        int time = 0;
        while(true) {
            time = time + aggressive;
            if (visitTime <= time) {
                return true;
            }
            time = time + calm;
            if (visitTime <= time) {
                return false;
            }
        }
    }
}