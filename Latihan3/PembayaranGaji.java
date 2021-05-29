/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author ASUS
 */
public class PembayaranGaji {
public int hitungGaji(Pegawai peg){
    int uang= peg.gaji;
    if(peg instanceof Direktur)
        uang+=((Direktur)peg).tunjangan();
    if(peg instanceof Staff)
        uang+=((Staff)peg).bonus();
    return uang;
}
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staff budi= new Staff();
        Direktur udin = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk Staff ="+pg.hitungGaji(budi));
        System.out.println("Gaji yang dibayarkan kepada Direktur ="+pg.hitungGaji(udin));
    }
    
}
