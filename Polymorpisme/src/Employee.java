public class Employee extends Person {
    
   private String name; 

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

   
   

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
   
}
