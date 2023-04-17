package src.classes;

public class User {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String diabetesType;
    
    public User(String name, int age, double weight, double height, String diabetesType) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.diabetesType = diabetesType;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
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
    
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", diabetesType='" + diabetesType + '\'' +
                '}';
    }
}
