/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico;

/**
 *
 * @author josef
 */
public class TestPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona roger = new Persona("Roger");
        roger.setEdad(Edad.edadRandom());
              
        System.out.println(roger.getEdad());
        
        roger.setEdad(Edad.edadRandom());
        
        System.out.println(roger.getEdad());
        
        roger.setEdad(Edad.edadRandom());
              
        System.out.println(roger.getEdad());
        
        roger.setEdad(Edad.edadRandom());
        
        System.out.println(roger.getEdad());
                
    }
    
}
