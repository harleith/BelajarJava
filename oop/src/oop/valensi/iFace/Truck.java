package oop.valensi.iFace;
public class Truck extends Vehicle implements Teloletable{

    @Override
    public String teloletOm() {
            System.out.println("Tulalit Tulalit");
        return "Tulalit Tulalit";}

    @Override
    public double frequency() {
    System.out.println(3.7);
        return 3.7; 
    }

    
}
