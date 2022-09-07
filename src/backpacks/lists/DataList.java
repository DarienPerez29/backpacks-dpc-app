
package backpacks.lists;

import java.util.ArrayList;
import backpacks.elements.Data;

/**
 *
 * @author dapec
 */
public class DataList {
    private ArrayList<Data> dataList;
    
    public DataList(){
        this.dataList = new ArrayList<>();
    }//end constructor
    
    //MÉTODOS DE LA LISTA DINÁMICA
    public void addData(Data data){
        this.dataList.add(data);
    }//end addData
    
    public Data getData(int index){
        return this.dataList.get(index);
    }//end getData
    
    public int sizeDataList(){
        return this.dataList.size();
    }//end sizeDataList
    
}//enc class
