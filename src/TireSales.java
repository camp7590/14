
public class TireSales {

     static void main(String[] args) {
        ArrayStack pole = new ArrayStack();
        Tire t;
         System.out.println("Adding 10 goodyears to the pole");
         for (int i = 0; i < 10; i++) {
             t = new Tire("Goodyear");
             
             pole.push(t);
            
         }
         System.out.println("Selling 4 tires ");
         for (int i = 0; i < 4; i++) {
             t = (Tire)pole.pop();
             System.out.println(t);
             
         }
         System.out.println("Addying 2 new Cooper Tires to stack");
         pole.push(new Tire("Cooper"));
          pole.push(new Tire("Cooper"));
          System.out.println("Selling another 4 tires");
          for (int i = 0; i < 4; i++) {
              System.out.println(pole.pop());
         }
          System.out.println("Next tire o be sold it" + pole.peekTop());
          System.out.println("Number of tires left on pole is " + pole.size());
    }
    
}
