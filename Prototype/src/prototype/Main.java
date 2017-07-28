/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Tesfay
 */
public class Main {
    
    public static void main(String[] args) throws CloneNotSupportedException{
        Employee E1 = new Employee(1,  null, null);
        Employee E2 = new Employee(2, null, null);        
        Employee E3 = new Employee(3, null, null);        
        Employee E4= new Employee(4,  null, null);
        
        Employee[] E1S = new Employee[2] ;
        E1S[0] = E2;
        E1S[1] = E3;
        E1.setSupervisor(E3);
        E1.setStaff(E1S);

        Employee[] E2S = new Employee[3];
        E2S[0] = E1;
        E2S[1] = E3;
        E2S[2] = E4;
        E2.setSupervisor(E1);
        E2.setStaff(E2S);
        
        
        Employee[] E3S = new Employee[2];
        E3S[0] = E1;
        E3S[1] = E2;
        E3.setSupervisor(E2);
        E3.setStaff(E3S);
        
        Employee EC = E1.clone();
        System.out.println(E1.getId());
        System.out.println(EC.getId());
    }
}
