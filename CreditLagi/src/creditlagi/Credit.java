package creditlagi;
public class Credit {
     private double hargaBarang;
     private double uangMuka;
     private double bungaTahunan;
     private int Durasi;
     
    
     
     public double pokokCicilan(){
         double PokokCicilan = this.hargaBarang - this.uangMuka;
         return PokokCicilan;
     }
     
     public double bungaCicilan(){
         double BungaCicilan = pokokCicilan() * this.bungaTahunan * this.Durasi / 12;
         return BungaCicilan;
     }
     
     public double TotalKredit(){
         double totalKredit = this.pokokCicilan() + this.bungaCicilan();
         return totalKredit;
     }
     
     public double cicilanPerBulan(){
         double CicilanPerBulan = TotalKredit() / this.Durasi;
         return CicilanPerBulan;
     }
     
}
