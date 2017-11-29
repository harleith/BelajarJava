package myObject;
public class forEach {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] bils = {1,2,3,4,5,6,7};
       
        int hasil = 0;
        for (int i = 0; i < bils.length; i++) {
            int bil = bils[i];  
            hasil += hasil; // for biasa
            }
        System.out.println("hasil "+hasil);
        
        int jumlah =0;
        for (int bil : bils){
            jumlah += bil;
        } // foreach
        System.out.println("jumlah: "+jumlah);
    }
     
}
