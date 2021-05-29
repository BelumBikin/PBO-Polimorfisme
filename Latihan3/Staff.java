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
class Staff extends Pegawai{
    private static final int gajiStaff=10000;
    private static final int bonusStaff=5000;
    
    public int gaji(){
        return gajiStaff;
    }
    public int bonus(){
        return bonusStaff;
    }
}
