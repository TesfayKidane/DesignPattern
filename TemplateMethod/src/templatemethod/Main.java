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
public class Main {

    public static ATemplateMethod tmv = new VerticalLetter();
    public static ATemplateMethod tmh = new HorizontalLetter();
    public static ATemplateMethod tmn = new NoneLetter();

    public static void main(String[] args) {
        String[] v = new String[]{"VERTICAL", "3", "3", "6", "6", "--*", "-**", "*--"};
        String[] h = new String[]{"HORIZONTAL", "3", "3", "6", "6", "--*", "-*-", "*--"};
        String[] n = new String[]{"NONE", "3", "3", "6", "6", "--*--", "-*--*-", "*----*"};
        printBasedOnType(v);
        printBasedOnType(h);
        printBasedOnType(n);

    }

    private static void printBasedOnType(String[] file) {
        String type = file[0];
        switch (type) {
            case "VERTICAL":
                tmv.print(file);
                System.out.println("");
                break;
            case "HORIZONTAL":
                tmh.print(file);
                System.out.println("");
                break;
            case "NONE":
                tmn.print(file);
                System.out.println("");
                break;
        }
    }
}
