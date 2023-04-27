package src.classes;

public class Medicine {
    private String name;
    private int weight;
    private double period;
    private String type;
    
    public Medicine(String name, int weight, double period, String type) {
        this.name = name;
        this.weight = weight;
        this.period = period;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public double getPeriod() {
        return period;
    }
    
    public void setPeriod(double period) {
        this.period = period;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", period=" + period +
                ", type='" + type + '\'' +
                '}';
    }
}