package src.classes;

public class Glicosis {
    private String date;
    private double admeasurement;

    public Glicosis(String date, double admeasurement){
        this.date = date;
        this.admeasurement = admeasurement;
    }

    public double getAdmeasurement() {
        return admeasurement;
    }
    public void setAdmeasurement(double admeasurement) {
        this.admeasurement = admeasurement;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
