/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author Tesfay
 */
public class NoneLetter extends ATemplateMethod{

    @Override
    public String[] getOtherHalf(String[] file) {
        return new String[0];
    }

    @Override
    public void printFullLetter(String[] original, String[] otherHalf) {
        if(otherHalf.length > 0)
        {
            System.out.println("Symetry should be empty");
        }
        
        for(int i = 0 ; i < original.length; i++)
            System.out.println(original[i]);
    }
    
}
