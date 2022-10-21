/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabrikacalisanlari;

/**
 *
 * @author Emre
 */
public class FabrikaCalisanlari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name="Emre";
        double salary=2000;
        int workHours=45,hireYear=1999;
        
        Employee bilgi=new Employee(name,salary,workHours,hireYear);
        System.out.println(bilgi);
    }
    
}
