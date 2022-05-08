import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        System.out.println("Vvedite null terminated posledovatel'nost' tselykh chysel:");
        Scanner sc = new Scanner(System.in);
        int curr = 0;
        int summ = 0;
        while ((curr = sc.nextInt()) != 0) {
            summ += curr;
        }
        System.out.println(String.format("Summa posledovatel'nosty %d", summ));
    }
}
