import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] field = new int[n];
        String[] bugs = scan.nextLine().split(" ");

        for (int i = 0; i < bugs.length; i++) {
            field[i] = 1;
        }
        String line = scan.nextLine();
        while (!line.equals("End")) {
            String[] command = scan.nextLine().split((" "));
            int bugsIndex = Integer.parseInt(command[0]);
            String direction = command[1];
            int flyLength = Integer.parseInt(command[2]);
            if (bugsIndex < 0 || bugsIndex >= field.length || field[bugsIndex] != 1) {
                line = scan.nextLine();
                continue;
            }
            if(direction.equals("right")){
                
            }
            line = scan.nextLine();
        }
    }
}
