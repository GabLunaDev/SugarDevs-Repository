package src.classes;

public class User extends Person{
    private double weight;
    private double height;
    private String diabetesType;
    private int lastglicosis;
    
    public User(String firstName, String lastName, int age, String email, String cellphone, boolean whatsapp, boolean telegram, double weight, double height, String diabetesType, int lastglicosis) {
        super(firstName, lastName, age, email, cellphone, whatsapp, telegram);
        this.weight = weight;
        this.height = height;
        this.diabetesType = diabetesType;
        this.lastglicosis = lastglicosis;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public String getDiabetesType() {
        return diabetesType;
    }
    
    public void setDiabetesType(String diabetesType) {
        this.diabetesType = diabetesType;
    }

    public int getLastglicosis() {
        return lastglicosis;
    }

    public void setLastglicosis(int lastglicosis) {
        this.lastglicosis = lastglicosis;
    }
    
    @Override
    public String toString() { // amigo pf adiciona glicose aqui!!!
        return "User{" +
                "name='" + getFirstName() + " " + getLastName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + weight +
                ", height=" + height +
                ", diabetesType='" + diabetesType +
                ", lastglicosis=" + lastglicosis + '\'' +
                '}';
    }
}
