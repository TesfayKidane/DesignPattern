/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizationproxy;

import java.util.Hashtable;

/**
 *
 * @author Tesfay
 */
public class Table implements ITable{
    private Hashtable<Integer, IRow> tableHT = new Hashtable<>();
    
    @Override
    public int numOfRows() {
        return tableHT.size();
    }

    @Override
    public IRow getRow(int rowNum) {
       return tableHT.get(rowNum);
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        tableHT.put(rowNum, row);
    }

    @Override
    public void deleteRow(int rowNum) {
        tableHT.remove(rowNum);
    }    

    @Override
    public void modifyRow(int rowNum, IRow row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
