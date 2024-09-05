package latihansoal;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Angka Ke - 1 : ");
        double bilangan1 = input.nextDouble();

        System.out.println("Masukkan Angka Ke - 2 : ");
        double bilangan2 = input.nextDouble();

        System.out.println("1. Tambah ");
        System.out.println("2. Kurang ");
        System.out.println("3. Kali ");
        System.out.println("4. Bagi ");
        System.out.println("5. Modulus ");

        System.out.println("Pilih Angka Operasi : ");
        int hasil = input.nextInt();

        switch (hasil){
            case 1:
                System.out.println("Jumlahnya : " + (bilangan1 + bilangan2));
                break;
            case 2:
                System.out.println("Jumlahnya : " + (bilangan1 - bilangan2));
                break;
            case 3:
                System.out.println("Jumlahnya : " + (bilangan1 * bilangan2));
                break;
            case 4:
                System.out.println("Jumlahnya : " + (bilangan1 / bilangan2));
                break;
            case 5:
                System.out.println("Jumlahnya : " + (bilangan1 % bilangan2));
                break;
            default:
                System.out.println("Pilihan Anda Salah");
                break;

        }







    }
}
