import java.util.Scanner;

public class VolumeBola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola: ");
        double radius = input.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Volume bola adalah: " + volume);

        input.close();
    }
}
