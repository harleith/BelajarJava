package oop.valensi.iFace;
public class Bus extends Vehicle implements Teloletable, Comparable<Bus> {

    private String busType;
    
    public void brake(){
        
    }
    
    @Override
    public String teloletOm() {
        System.out.println("Tulalit Tulalit");
        return "Tulalit Tulalit";
    }

    
    @Override
    public double frequency() {
        System.out.println(3.7);
        return 3.7;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override

    void setBusType(String metromini) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
