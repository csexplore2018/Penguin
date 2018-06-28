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
        System.out.println(b.name);
        b.talk();
       
        Emperor c = new Emperor();
        System.out.println(c.name);
        c.talk();
        
        c.eat();
        b.sleep();
    }
    
}

class Animal{
    
    public String name = "Penguin";
    public String food = "Krill";
    public void talk(){
        System.out.println("Squak");
    
    }
    public void eat(){
         System.out.println("NomNOm");
    }
    public void sleep(){
         System.out.println("zzzzzzzzzz");
    }
    
}

class Chick extends Animal{
    
    public String name = "Chick";
    public String food = "Krill";
    
    public void talk(){
        System.out.println("Squaking");
    }
}

class Emperor extends Chick{
    
    public String name = "Emp";
    public String food = "Krill";
    
    public void talk(){
        System.out.println("Waddle");
    }
}

interface Actions{
    public void eat();
    public void sleep();
}