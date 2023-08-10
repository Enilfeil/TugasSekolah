import java.util.Scanner;

public class KalkulatorBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator BMI");
        System.out.print("Masukkan berat Anda dalam kilogram: ");
        double berat = scanner.nextDouble();

        System.out.print("Masukkan tinggi Anda dalam meter: ");
        double tinggi = scanner.nextDouble();

        double bmi = hitungBMI(berat, tinggi);
        System.out.println("BMI Anda adalah: " + bmi);
        System.out.println(getKategoriBMI(bmi));

        scanner.close();
    }

    public static double hitungBMI(double berat, double tinggi) {
        return berat / (tinggi * tinggi);
    }

    public static String getKategoriBMI(double bmi) {
        if (bmi < 16) {
            return "Sangat kurus";
        } else if (bmi < 18.5) {
            return "Kurus";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Gemuk";
        } else if (bmi < 35) {
            return "Obesitas Kelas I";
        } else if (bmi < 40) {
            return "Obesitas Kelas II";
        } else {
            return "Obesitas Kelas III";
        }
    }
}

