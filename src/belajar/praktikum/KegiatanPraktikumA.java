package belajar.praktikum;

interface InterfaceHitung {
    public abstract double hitung(int a, int b);

}

class Penjumlahan implements InterfaceHitung {

    @Override
    public double hitung(int a, int b) {
        return a + b;
    }

}

class Pengurangan implements InterfaceHitung {

    @Override
    public double hitung(int a, int b) {
        return a - b;
    }

}

class Perkalian implements InterfaceHitung {

    @Override
    public double hitung(int a, int b) {
        return a * b;
    }

}

class Pembagian implements InterfaceHitung {

    @Override
    public double hitung(int a, int b) {
        return a / b;
    }

}

public class KegiatanPraktikumA {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        InterfaceHitung objHitung;

        objHitung = new Penjumlahan();
        System.out.println("Hasil Penjumlahan\t= " + objHitung.hitung(a, b));

        objHitung = new Pengurangan();
        System.out.println("Hasil Pengurangan\t= " + objHitung.hitung(a, b));

        objHitung = new Perkalian();
        System.out.println("Hasil Perkalian\t\t= " + objHitung.hitung(a, b));

        objHitung = new Pembagian();
        System.out.println("Hasil Pembagian\t\t= " + objHitung.hitung(a, b));

    }

}
