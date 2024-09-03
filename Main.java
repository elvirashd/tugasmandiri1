/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmusik;

/**
 *
 * @author Nama: : elvira solikha H.I(09040623057)
 */
public class Main {
  public static void main(String[] args) {
        MainMusik Gitar = new Gitar();
        Gitar.main();// Output: Memainkan gitar dengan memetik senar.

        MainMusik Piano = new Piano ();
        Piano.main();// Output: Memainkan piano dengan menekan tuts.
    }   
}

// menggunakan interface karena setiap alat musik dapat dimainkan dengan cara yang begbeda beda sesuai dengan kebutuhan masing masing
// mendefinisikan perilaku yang bisa diimplementasikan oleh kelas dari induk yang berbeda
// main musik sebagai interface
// kelas piano dan gitar mengimplementasikan interface dari main musik
