import java.util.Scanner;

public class Problem_2440 {
    public static void main(String[] args) {
        int x, y, z;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for(int i = 0; i < x; i++, System.out.println(" "))
            for(int n = i; n < x; n++)
                System.out.print("*");
    }
}
