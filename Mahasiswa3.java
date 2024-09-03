/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa3;

/**
 *
 * @author Nama: : elvira solikha H.I(09040623057)
 */
abstract class Mahasiswa3 {
    String nama;
    String NIM;

    Mahasiswa3(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // Metode abstrak untuk proses registrasi
    abstract void registrasi();

    // Metode umum untuk menampilkan informasi mahasiswa
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
    }
}
// sebuah abstract classnya
// disini ada implementasi metode registrasi 

