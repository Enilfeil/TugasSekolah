package Sekolah;

import java.util.Scanner;

public class pdam {
    
    static void nama(int ayame){
        String pelanggan[] = {"Ali","Budi","Dani","Edi","Umar"};
        System.out.println(pelanggan[ayame-1]);
    }
    static void tarif(int pemakaian){
        int laplus = 0;
        if(pemakaian >= 1 && pemakaian <= 10){
            pemakaian = 10;
            laplus = pemakaian*2000;
        }else if(pemakaian >=11 && pemakaian <= 20){
        pemakaian = 10;
        laplus = pemakaian*3000;
    }else if (pemakaian >= 21 && pemakaian <=20){
        pemakaian = 10;
        laplus = pemakaian*4000;
    }else if (pemakaian >= 31){
        pemakaian = 10;
        laplus= pemakaian*5000;
    }
    System.out.println(laplus);
    }
    public static void main(String[] args) {
        Scanner iofi = new Scanner(System.in);
        boolean status = true;

        do{
            System.out.println("Masukan ID: ");
            int pelanggan = iofi.nextInt();
            System.out.println("Nama Pelanggan: "+pelanggan);
            System.out.println("Nama Pelanggan: ");
            nama(pelanggan);

            System.out.print("Banyak Pemakaian Air: ");
            int pemakaian = iofi.nextInt();
            System.out.println("Jumlah Tarif: ");
            tarif(pemakaian);

            System.out.println("Ulangi? Y/N");
            String moona = iofi.next();
            if(moona.equalsIgnoreCase("n")){
                status = false;
            } else {
                status = true;
            }
        }while (status);
    }
}
