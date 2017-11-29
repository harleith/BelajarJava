/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditlagi;
public class Nasabah {
    String Nama;
    String alamat;
    double gajiPokok;
    double bonus;
    double pendapatanLain;
    int tanggungan;
    Credit kredit;
    
    public double hitungPenghasilanBulanan() {
        double total = this.gajiPokok + this.bonus + this.pendapatanLain;
        return total;
    }
    
    public double hitungLimit() {
        double limit = hitungPenghasilanBulanan() / (tanggungan+1);
        return limit;
    }
    
    
     public double penghasilanBulanan(){
        double PenghasilanBulanan = this.gajiPokok + this.bonus;
        return PenghasilanBulanan;
     }
    
     public double limitPinjaman(){
         double LimitPinjaman = penghasilanBulanan() / (this.tanggungan + 1);
         return LimitPinjaman;
     }
    public boolean isSetuju(){
        boolean hasil = hitungLimit() > kredit.cicilanPerBulan();
        return hasil;
    }
}
