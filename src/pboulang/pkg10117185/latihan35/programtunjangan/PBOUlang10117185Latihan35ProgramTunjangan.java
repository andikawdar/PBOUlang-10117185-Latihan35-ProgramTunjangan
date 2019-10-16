/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan35.programtunjangan;

/**
 *
 * @author user
 * NAMA      : Andhyka Widariyanto
 * KELAS     : PBO-Ulang
 * NIM       : 10117185
 * Deskripsi : Membuat Perhitungan Program Tunjangan
 */
public class PBOUlang10117185Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tunjangan tun = new Tunjangan();
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan ? : Rp. ");
        tun.gajiPokok = scnr.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        tun.status = scnr.next();
        tun.HasilHitung(tun.status,tun.gajiPokok);
    }
    
}
