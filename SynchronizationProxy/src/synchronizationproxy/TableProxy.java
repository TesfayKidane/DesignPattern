/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizationproxy;

/**
 *
 * @author Tesfay
 */
public class TableProxy implements ITable{

    private ITable table = new Table(); 
    
    @Override
    public synchronized int numOfRows() {
        return table.numOfRows();
    }

    @Override
    public synchronized IRow getRow(int rowNum) {
        return table.getRow(rowNum);
    }

    @Override
    public synchronized void addRow(IRow row, int rowNum) {
        table.addRow(row, rowNum);
    }

    @Override
    public synchronized void deleteRow(int rowNum) {
        table.deleteRow(rowNum);
    }    

    @Override
    public void modifyRow(int rowNum, IRow row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
