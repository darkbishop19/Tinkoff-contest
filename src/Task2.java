import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int k=1;
        if ( N%2 == 0 && N != 0){
            while (N/2 >= 2){
                k++;
                N= N/2;
            }

        }
        System.out.println(k);
    }
}
