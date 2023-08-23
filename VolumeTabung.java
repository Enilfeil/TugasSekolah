import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double height = input.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("Volume tabung adalah: " + volume);

        input.close();
    }
}
