package src.classes;
public class Diet {
    private String types;
    private String results;
    
    public Diet(String types, String results) {
        this.types = types;
        this.results = results;
    }
    
    public String getTypes() {
        return types;
    }
    
    public void setTypes(String types) {
        this.types = types;
    }
    
    public String getResults() {
        return results;
    }
    
    public void setResults(String results) {
        this.results = results;
    }
    
    @Override
    public String toString() {
        return "Diet{" +
                "types='" + types + '\'' +
                ", results='" + results + '\'' +
                '}';
    }
}
