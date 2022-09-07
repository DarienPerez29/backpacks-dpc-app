package backpacks.tools;

/**
 *
 * @author dapec
 */
public class randomDataGenerator {
       
    private int randBrand;
    private String randModel;
    private String randColor;
    private Double randPrice;
    private int randZippers;
    private int randIndexSize;
    private String randDesc;    
    
    public randomDataGenerator(){
        randBrand = 0;
        randModel = "";
        randColor = "";
        randPrice = 0.0;
        randZippers = 0;
        randIndexSize = 0;
        randDesc = "";
    }//end constructor
    
    public void generateRandomValues(){
        //Seleccionar marca
        this.randBrand = (int)(Math.random()*5)+1;
        
        //Seleccionar modelo
        String[] defaultModels = {"Travel", "Fit", "B100", "Waterproof", "Minimal", "Cool", "RJ45"};
        this.randModel = defaultModels[(int)(Math.random()*7)];
        
        //Seleccionar color
        String[] defaultColors = {"Amarillo", "Rojo", "Negro", "Naranja", "Azul", "Verde", "Rosa", "Beige", "Multiculor"};
        this.randColor = defaultColors[(int)(Math.random()*9)];
        
        //Seleccionar precio
        int genPrice = ((int)(Math.random()*20)+1)*100;
        this.randPrice = Double.valueOf(genPrice);
        
        //Seleccionar numero de cierres
        this.randZippers = (int)(Math.random()*20)+1;
        
        //Seleccionar índice de opción
        this.randIndexSize = (int)(Math.random()*4);
        
        //Seleccionar descripción
        String[] defaultDesc = {
            "Mochila super genial", 
            "Mochila comoda para viajes",
            "Mochila para ir a la montaña",
            "Mochila para guardar muchas cosas",
            "Mochila para hacer deporte"
        };
        
        this.randDesc = defaultDesc[(int)(Math.random()*5)];
    }//end generateRandomValues
    
    
    //GETTERS
    public int getRandBrand() {
        return randBrand;
    }//end getRandBrand

    public String getRandModel() {
        return randModel;
    }//end getRandModel

    public String getRandColor() {
        return randColor;
    }//end getRandColor

    public Double getRandPrice() {
        return randPrice;
    }//end getRandPrice

    public int getRandZippers() {
        return randZippers;
    }//end getRandZippers

    public int getRandIndexSize() {
        return randIndexSize;
    }//end getRandIndexSize

    public String getRandDesc() {
        return randDesc;
    }//end getRandDesc    
    
}//end class
