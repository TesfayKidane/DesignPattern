/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.util.Arrays;

/**
 *
 * @author Tesfay
 */
public class HorizontalLetter extends ATemplateMethod{

    @Override
    public String[] getOtherHalf(String[] file) {
        
        String[] result = Arrays.copyOfRange(file, 0, file.length);
        
        int i = 0;
        int j = file.length - 1;
        
        while(i < j){
            String temp = result[i];
            result[i] = result[j];
            result[j] = temp;
            i++;
            j--;
        }
        
        return result;
        
    }

    @Override
    public void printFullLetter(String[] original, String[] otherHalf) {
        
        if(original.length != otherHalf.length){
            System.out.println("Original and Symetry length not equal");
            return;
        }
        
        for(int i = 0 ; i < original.length; i++)
        {
            System.out.println(original[i]);
        }
        
        for(int j = 0 ; j < otherHalf.length; j++){
            System.out.println(otherHalf[j]);
        }
    }
    
}
