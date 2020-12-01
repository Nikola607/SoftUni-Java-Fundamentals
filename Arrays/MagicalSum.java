import java.util.Arrays;
import java.util.Scanner;

public class MagicalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int neededSum = Integer.parseInt(scan.nextLine());

        for(int i = 0;i<numbers.length; i++){
            for(int j = i+1;j<numbers.length;j++){
                if(numbers[i] + numbers[j] == neededSum){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
