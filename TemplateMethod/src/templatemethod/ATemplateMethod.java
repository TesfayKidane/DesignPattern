/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tesfay
 */
public abstract class ATemplateMethod {

  
    public abstract String[] getOtherHalf(String[] file);
    public abstract void printFullLetter(String[] original, String[] otherHalf);
    
    public void print(String[] file){
        String[] letters = Arrays.copyOfRange(file, 5, file.length);
        String[] otherHalf = getOtherHalf(letters);
        printFullLetter(letters, otherHalf);
    }    
}
