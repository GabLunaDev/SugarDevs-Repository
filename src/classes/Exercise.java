package src.classes;
public class Exercise {
    private String muscularGroup;
    private String name;
    private String turns;
    private String duration;
    
    public Exercise(String muscularGroup, String name, String turns, String duration) {
        this.muscularGroup = muscularGroup;
        this.name = name;
        this.turns = turns;
        this.duration = duration;
    }
    
    public String getMuscularGroup() {
        return muscularGroup;
    }
    
    public void setMuscularGroup(String muscularGroup) {
        this.muscularGroup = muscularGroup;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTurns() {
        return turns;
    }
    
    public void setTurns(String turns) {
        this.turns = turns;
    }
    
    public String getDuration() {
        return duration;
    }
    
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    @Override
    public String toString() {
        return "Exercise{" +
                "muscularGroup='" + muscularGroup + '\'' +
                ", name='" + name + '\'' +
                ", turns='" + turns + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
