
package backpacks.elements;

/**
 *
 * @author dapec
 */
public class Data {
    private String brand;
    private String model;
    private String color;
    private Double price;
    private int numZippers;
    private String size;
    private String description;
    
    public Data(){
        this.brand = "Sin marca";
        this.model = "Sin modelo";
        this.color = "Sin color";
        this.price = 0.0;
        this.numZippers = 0;
        this.size = "Sin tamaño";
        this.description = "Sin descripción";
    }//end constructor sin parámetros

    public Data(String brand, String model, String color, Double price, int numZippers, String size, String description) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.numZippers = numZippers;
        this.size = size;
        this.description = description;
    }//end constructor con parámetros
    
    //SETTERS
    public void setBrand(String brand) {
        this.brand = brand;
    }//end setBrand

    public void setModel(String model) {
        this.model = model;
    }//end setModel

    public void setColor(String color) {
        this.color = color;
    }//end setColor

    public void setPrice(Double price) {
        this.price = price;
    }//end setPrice

    public void setNumZippers(int numZippers) {
        this.numZippers = numZippers;
    }//end setNumZippers

    public void setSize(String size) {
        this.size = size;
    }//end setSize

    public void setDescription(String description) {
        this.description = description;
    }//end setDescription

    //GETTERS
    public String getBrand() {
        return brand;
    }//end getBrand

    public String getModel() {
        return model;
    }//end getModel

    public String getColor() {
        return color;
    }//end getColor

    public Double getPrice() {
        return price;
    }//end getPrice

    public int getNumZippers() {
        return numZippers;
    }//end getNumZippers

    public String getSize() {
        return size;
    }//end getSize

    public String getDescription() {
        return description;
    }//end getDescription
    
    @Override
    public String toString(){
        return this.getBrand() + " - " + this.getModel() + " - " + this.getColor() + " - " 
                + this.getPrice() + " - " + this.getNumZippers() + " - " + this.getSize() + " - "
                + this.getDescription();
    }//end toString
    
    public String toStringCsv(){
        return this.getBrand() + "," + this.getModel() + "," + this.getColor() + "," 
                + this.getPrice() + "," + this.getNumZippers() + "," + this.getSize() + ","
                + this.getDescription();
    }//end toStringCsv
    
}//end class
