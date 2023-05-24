package src.classes;

public class Glicosis {
    private String date;
    private double admeasurement;

    public Glicosis(String date, double admeasurement) throws Exception{
        this.date = date;
       setAdmeasurement(admeasurement);
    }

    public double getAdmeasurement() {
        return admeasurement;
    }

    public void setAdmeasurement(double admeasurement) throws Exception{
        if(admeasurement < 0){
            throw new Exception("Invalid input to admeasurement");
        }
        this.admeasurement = admeasurement;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
