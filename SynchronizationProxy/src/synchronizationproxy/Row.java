/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizationproxy;

import java.util.Objects;

/**
 *
 * @author Tesfay
 */
public class Row implements IRow{

    private String column1;
    private String column2;
    private String column3;

    public Row(String column1, String column2, String column3) {
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
    }
    
    
    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.column1);
        hash = 59 * hash + Objects.hashCode(this.column2);
        hash = 59 * hash + Objects.hashCode(this.column3);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Row other = (Row) obj;
        if (!Objects.equals(this.column1, other.column1)) {
            return false;
        }
        if (!Objects.equals(this.column2, other.column2)) {
            return false;
        }
        if (!Objects.equals(this.column3, other.column3)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Row{" + "column1=" + column1 + ", column2=" + column2 + ", column3=" + column3 + '}';
    }
  
    public Row doDeepClone(){
        return new Row(column1, column2, column3);
    }
    
    public Row doShallowClone(){
        Row r = this;
        return r;
    }
    
}
