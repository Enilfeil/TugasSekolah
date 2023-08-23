import java.util.Scanner;

public class testdoang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan nilai sisi");
        int a = input.nextInt ();
        int b = a*a;

        System.out.println("Luas persegi dengan "+ "sisi: " +a+ "adalah" +b);
    }
}
