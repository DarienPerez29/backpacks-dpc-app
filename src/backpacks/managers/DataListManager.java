
package backpacks.managers;


import java.io.IOException;
import java.util.ArrayList;
import backpacks.elements.Data;
import backpacks.lists.DataList;
import backpacks.tools.FileActions;
/**
 *
 * @author dapec
 */
public class DataListManager {
    private DataList dataList;
    
    public DataListManager(){
        this.dataList = new DataList();
    }//end constructor
    
    public void fillListWithFile(String pathFile) throws IOException{
        FileActions file = new FileActions(pathFile);
        ArrayList<String> fileList = file.getFileRows();
        Data datum;
        String[] values;
        
        for(int i = 0; i < fileList.size(); i++){
            values = fileList.get(i).split(",");
            
            datum = new Data();
            datum.setBrand(values[0]);
            datum.setModel(values[1]);
            datum.setColor(values[2]);
            datum.setPrice(Double.parseDouble(values[3]));
            datum.setNumZippers(Integer.parseInt(values[4]));
            datum.setSize(values[5]);
            datum.setDescription(values[6]);
            
            this.dataList.addData(datum);
        }//end for llenar dataList
    }//end fillListWithFile
    
    public String getPrintedList(){
        String listContent = "";
        for (int i = 0; i < this.dataList.sizeDataList(); i++){
            listContent += "REGISTRO " + (i+1) + ": " + this.dataList.getData(i).toString() + "\n";
        }//end for
        return listContent;
    }//end getPrintedList
    
}//end class
