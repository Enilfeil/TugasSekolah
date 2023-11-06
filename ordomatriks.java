import java.util.Scanner;

public class ordomatriks {
    public static void main(String[] args) {
        Scanner bruh = new Scanner(System.in);

        System.out.println("Masukan Baris : ");
        int aqua = bruh.nextInt();
        System.out.println("Masukan Kolom :");
        int sora = bruh.nextInt();

        int suisei[][] = new int[aqua][sora];

        for (int ayame = 0; ayame < suisei.length; ayame++){
            for (int laplus = 0; laplus < suisei[ayame].length; laplus++){
                System.out.print("Masukan Nilai Matrix "+ (laplus + 1) + " baris "+(ayame+1)+ ":");
                suisei[ayame][laplus] = bruh.nextInt();
            }

        }
        System.out.println("===Matrix===");
        for (int ayame = 0; ayame < suisei.length; ayame++){
            for (int laplus = 0; laplus < suisei[ayame].length; laplus++){
                System.out.print("["+suisei[ayame][laplus]+"]"+ "");
}
System.out.println();
        }
}
}
