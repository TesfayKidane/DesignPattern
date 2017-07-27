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
public class VerticalLetter extends ATemplateMethod{

    @Override
    public String[] getOtherHalf(String[] file) {
        String[] result = new String[file.length];
        for (int i = 0; i < file.length; i++) {
            result[i] = reverseString(file[i]);
        }
        return result;
    }

    @Override
    public void printFullLetter(String[] original, String[] otherHalf){
      
        if(original.length != otherHalf.length){
            System.out.println("Original and Symetry length not equal");
            return;
        }
        
        for(int i = 0 ; i < original.length; i++){
            System.out.println(original[i]+""+otherHalf[i]);
        }
    }
    private String reverseString(String line) {
        int i = 0 ; 
        int j = line.length() - 1;
        char[] lineLetters = line.toCharArray();
        while(i < j){
            char temp = lineLetters[i];
            lineLetters[i] = lineLetters[j];
            lineLetters[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(lineLetters);
    }
}
