/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penguin;

/**
 *
 * @author gc_ua4
 */
public class Penguin {
    
    private String name = "Penguin";
    public String food = "Krill";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a = new Animal();
        System.out.println(a.name);
        a.talk();
 
        Chick b = new Chick();
        //System.out.println(b.name);
        b.talk();
       
    }
    
}

class Animal{
    
    public String name = "Penguin";
    public String food = "Krill";
    public void talk(){
        System.out.println("Squak");
    
    }
    
}

class Chick extends Animal{
    public String name = "Chick";
    public void talk(){
        System.out.println("Squaking");
    }
 }
