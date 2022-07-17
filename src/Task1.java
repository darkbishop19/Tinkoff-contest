import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(),
                B = sc.nextInt(),
                C = sc.nextInt(),
                D = sc.nextInt(),
                sum = 0;

        if ( B >= D ){
            sum = A;
            System.out.println(sum);
        }
        else{
            sum = A + (D-B)*C;
            System.out.println(sum);
        }
    }
}
