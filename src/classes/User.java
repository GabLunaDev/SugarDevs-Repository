package src.classes;
import java.util.ArrayList;

public class User extends Person{
    private double weight;
    private double height;
    private String diabetesType;
    private ArrayList<Glicosis> admeasurement;
    
    public User(String firstName, String lastName, int age, String email, String cellphone, boolean whatsapp, boolean telegram, double weight, double height, String diabetesType) throws Exception {
        super(firstName, lastName, age, email, cellphone, whatsapp, telegram);
        setWeight(weight);
        this.height = height;
        this.diabetesType = diabetesType;
        this.admeasurement = new ArrayList <>();
        }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight)throws Exception {
        if(weight > 500 || weight < 0){
            throw new Exception("Invalid input to weight");
        }

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
    
    @Override
    public String toString() { // amigo pf adiciona glicose aqui!!!
        return "User{" +
                "name='" + getFirstName() + " " + getLastName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + weight +
                ", height=" + height +
                ", diabetesType='" + diabetesType + '\'' +
                '}';
    }
}
