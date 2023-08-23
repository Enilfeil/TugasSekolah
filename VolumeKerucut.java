import java.util.Scanner;

public class VolumeKerucut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari alas kerucut: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        double height = input.nextDouble();

        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;

        System.out.println("Volume kerucut adalah: " + volume);

        input.close();
    }
}
