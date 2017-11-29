public class testPoly {
    public static void main(String[] args) {


//                          Object (ini di buat secara default (tidak di tuliskan tapi sudah ada ada dari javanya))
//                            |
//                          Person        
//                            | 
//        Programmer    Direktur    Sekretaris  Sales Employee
//            |
//        Developer
//        
//


        Employee eee = new Programmer();
        eee.setName("EE Einstein");
        ///eee.coding();

        
        Programmer aProgrammer = (Programmer) eee; // casting object
        aProgrammer.coding();
        System.out.println("Nama+ "+aProgrammer.getName());
        
        //peran dari reference terhadap object
        
        Employee staf = new Employee();
        staf.setName("Doel");
        
        Programmer joe = new Programmer();
        //joe.setNama("Joek"); --- karena di programer ga ada variabel namaa
        joe.coding();
        
        //reference membatasi method yang bisa di batasi dari object

        // reference atas ke bawah
        Person p = new Person();
        Direktur d = new Direktur();
        Programmer programer = new Programmer();
        Object oo = new Object();
        
        // reference yg salah dari bawah ke atas
//        Developer d = new Programmer();
//        Person a = new Developer();
//        Developer ds = new  Person();
//        Direktur dir = new Person();        
//        
        // reference ke samping ga bisa
//        Programmer prog = new Sales();
//        
        
        Programmer Android = new Developer();
        
        // object tanpa reference
        new Sales();
        

    }
    
}
