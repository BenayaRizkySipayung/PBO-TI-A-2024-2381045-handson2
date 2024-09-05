package BinaryOperator;

public class Perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean hasilSamaDengan = (a == b);
        System.out.println("a == b: " + hasilSamaDengan);

        boolean hasilTidakSamaDengan = (a != b);
        System.out.println("a 1= b:" + hasilTidakSamaDengan);

        boolean hasilLebihBesarDari = (a > b);
        System.out.println(" a > b:" + hasilLebihBesarDari);

        boolean HasilLebihBesarSamaDengan = (a >= b);
        System.out.println("a >= b:" +HasilLebihBesarSamaDengan);

        boolean hasilLebihKecilSamaDengan =(a <= b);
        System.out.println("a <= b: " + hasilLebihKecilSamaDengan);
    }
}
