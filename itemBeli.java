import java.util.Scanner;

public class itemBeli {
    public static void main(String[] args) {
        Scanner bruh = new Scanner(System.in);
            
            System.out.println("Masukan jumlah Item: ");
            int sora =  bruh.nextInt();
            int gura = 1;
            int ayame = 0;
            int suisei = 0;
            int iroha = 0;
            while (sora >= gura) {

            System.out.println(gura + ". Nama barang : ");
            String lapluss = bruh.next();

            System.out.println(gura + ". Harga: ");
            ayame = bruh.nextInt();

            System.out.println(gura + ". Jumlah: ");
            suisei = bruh.nextInt();
            System.out.println("================");

            iroha += ayame * suisei;
            gura++;
            }

            System.out.println("Jumlah Item Yang Dibeli: " + sora);
            System.out.println("Total Harga: " + iroha);
            
    }
}
