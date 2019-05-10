package object;

public class Animal {
	
    private String type;
    private String feature;

    public Animal() {
    	
    }

    public Animal(String type, String feature) {
        this.type = type;
        this.feature = feature;
        
    }

    public String getType() {
        return type;
        
    }

    public void setType(String type) {
        this.type = type;
        
    }

    public String getFeature() {
        return feature;
        
    }

    public void setFeature(String feature) {
        this.feature = feature;
        
    }
    
}