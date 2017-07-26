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
public interface ITable {

    public int numOfRows();

    public IRow getRow(int rowNum);

    public void addRow(IRow row, int rowNum); //add row at the end public void modifyRow(int rowNum, IRow row);
    
    public void modifyRow(int rowNum, IRow row);

    public void deleteRow(int rowNum);
}
