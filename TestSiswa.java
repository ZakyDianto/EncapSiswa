package Latihan3;

import java.util.Scanner;

public class TestSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Agus");
        siswa.setAbsen(20);
        siswa.setAddress("Malang");

        System.out.println("Nama: " +siswa.getName()+" alamat "+siswa.getAddress()+" berumur "+siswa.getAbsen()+" tahun.");
    }
}
