/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;
/**
 * Nama     : Azis komara
 * Kelas    : IF-1
 * Nim      : 10118029
 * deskiripsi program   : kambing static dan konstanta

*/



public class KambingStatic {

    //NAMA_KAMBING sebagai kontanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebayak" + Mamalia.jumlahKambing);
                
    }
}
    

