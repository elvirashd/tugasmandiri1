/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa3;

/**
 *
 * @author Nama: : elvira solikha H.I(09040623057)
 */
public class MahasiswaReguler extends Mahasiswa3{
MahasiswaReguler(String nama, String NIM) {
        super(nama, NIM);
    }

    @Override
    void registrasi() {
        System.out.println("Registrasi Mahasiswa Reguler.");
    }
} 
//mahasiswa reguler mewarisi mahasiswa3 dan mengimplementasikan metode registrasi

