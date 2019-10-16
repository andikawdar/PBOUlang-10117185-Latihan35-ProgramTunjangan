/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 * NAMA      : Andhyka Widariyanto
 * KELAS     : PBO-Ulang
 * NIM       : 10117185
 * Deskripsi : Membuat Perhitungan Program Tunjangan
 */
public class tunjangan {
    public String status;
    public Double gajiPokok;
    public Double tunjangan;
    
    public Double HitungTunjangan(String parStatus, double parGajiPokok){
    return tunjangan=(parStatus.equals("Menikah")?0.35*parGajiPokok:0); }
    
    public Double HitungTotalGaji(double parGajiPokok, double parTunjangan){
    return tunjangan = parGajiPokok+parTunjangan;}
    
    public void HasilHitung(String parStatus, double parGajipokok){
    System.out.println("\n=========Hasil Perhitungan Gaji Anda=========");
    System.out.println("Gaji Pokok \t: Rp "+gajiPokok);
    System.out.println("Tunjangan \t: Rp "+HitungTunjangan(parStatus,parGajipokok));
    System.out.println("Total Gaji \t: Rp "+HitungTotalGaji(parGajipokok,tunjangan));
    System.out.println("(Developed by : Andhyka Widariyanto)");
}
