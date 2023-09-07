import java.util.Scanner;


public class katNilai {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner (System.in);
        System.out.println("Masukan Nama:");
        String nama = input.nextLine();

        System.out.println("Masukan Nilai"+nama);
        int nilai = input.nextInt();

        String predikat = null;
        String kategori = null;

        if(nilai >96 && nilai <= 100){
            predikat = "A";
            kategori = "Sangat Baik";
            
        }
        else if(nilai >90 && nilai<= 95){
            predikat ="A-";
            kategori = "Sangat Baik";

        }
        else if(nilai >84 && nilai<= 89){
            predikat ="B+";
            kategori = "Baik";

        }
        else if(nilai >78 && nilai<= 83){
            predikat ="B";
            kategori = "Baik";

        }
        else if(nilai >74 && nilai<= 77){
            predikat ="B-";
            kategori = "Baik";
        }
        else if(nilai >69 && nilai<= 73){
            predikat ="C+";
            kategori = "Cukup";

        }
        else if(nilai >65 && nilai<= 68){
            predikat ="C";
            kategori = "Cukup";

        }
        else if(nilai >60 && nilai<= 64){
            predikat ="C-";
            kategori = "Cukup";
        }else {
            predikat ="D";
            kategori = "Nguwawor";
        }
        System.out.println("Nama: "+nama);
        System.out.println("Nilai: "+nilai);
        System.out.println(predikat);
        System.out.println(kategori);
}

}
