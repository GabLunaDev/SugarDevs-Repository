package src.classes;

public abstract class Person extends Contact {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age, String email, String cellphone, boolean whatsapp, boolean telegram){
        super(email, cellphone, whatsapp, telegram);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
