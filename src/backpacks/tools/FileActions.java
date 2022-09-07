
package backpacks.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;

/**
 *
 * @author dapec
 */
public class FileActions {
    private String pathFile;
    
    public FileActions(){
        this.pathFile = "";
    }//end constructor sin parámetro
    
    public FileActions(String pathFile){
        this.pathFile = pathFile;
    }//end constructor con parámetro
    
    //SETTERS
    public void setPathFile(String pathFile){
        this.pathFile = pathFile;
    }//end setPathFile
    
    //GETTERS
    public String getPathFile(){
        return this.pathFile;
    }//end getPathFile
    
    
    //MÉTODOS PRINCIPALES
    public void fillFile(String Data) throws IOException{
        BufferedWriter fill = new BufferedWriter(new FileWriter(this.pathFile, true));
        fill.write(Data);
        fill.close();
    }//end fillFile
    
    public ArrayList<String> getFileRows() throws FileNotFoundException, IOException{
        ArrayList<String> fileRows = new ArrayList<>();
        String rowInRead;
        BufferedReader read = new BufferedReader(new FileReader(this.pathFile));
        
        while((rowInRead = read.readLine()) != null){
            fileRows.add(rowInRead);
        }//end while read data from file
        
        read.close();
        return fileRows;
    }//end fillFile
    
    public void selectPathFile(){
        try{
            JFileChooser pathSelectionWindow = new JFileChooser();
            pathSelectionWindow.setDialogTitle("Selecciona tu archivo CSV");
            pathSelectionWindow.setAcceptAllFileFilterUsed(false);
            pathSelectionWindow.addChoosableFileFilter(new FileNameExtensionFilter("CSV (*.CSV)","csv"));
            pathSelectionWindow.showOpenDialog(null);
            this.pathFile = pathSelectionWindow.getSelectedFile().getAbsolutePath();
            JOptionPane.showMessageDialog(null, "Se ha seleccionado una ruta\n", "Ruta seleccionada", JOptionPane.INFORMATION_MESSAGE);
        }//end try
        catch(Exception e){
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, "Seleccoina una ruta válida", "Ruta no válida", JOptionPane.WARNING_MESSAGE);
            this.pathFile = "";
        }//end catch
        
    }//end selectPathFile
    
}//end FileActions
