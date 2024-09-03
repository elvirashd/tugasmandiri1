/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa3;

/**
 *
 * @author Nama: : elvira solikha H.I(09040623057)
 */
public class MahasiswaInternational extends Mahasiswa3{
String negaraAsal;

    MahasiswaInternational(String nama, String NIM, String negaraAsal) {
        super(nama, NIM);
        this.negaraAsal = negaraAsal;
    }

    @Override
    void registrasi() {
        System.out.println("Registrasi Mahasiswa Internasional dari " + negaraAsal + ".");
    }

    @Override
    void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Negara Asal: " + negaraAsal);
    }
}
//mahasiswa internasional mewarisi mahasiswa3 dan mengimplementasikan metode registrasi
