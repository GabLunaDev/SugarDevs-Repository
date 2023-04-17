package src.classes;

public class Nutricionist {
    private String name;
    private String crn;
    
    public Nutricionist(String name, String crn) {
        this.name = name;
        this.crn = crn;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCrn() {
        return crn;
    }
    
    public void setCrn(String crn) {
        this.crn = crn;
    }
    
    @Override
    public String toString() {
        return "Nutricionist{" +
                "name='" + name + '\'' +
                ", crn='" + crn + '\'' +
                '}';
    }
}
