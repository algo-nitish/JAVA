package OOPS;

public class Getters_Setters {
     public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.Setcolor("blue");
        System.out.println(p1.getColor());
        p1.Settip(5);
        System.out.println(p1.getColor());
        p1.Setcolor("Yellow") ;
        System.out.println(p1.getColor());
       
    }
}


class Pen{
  private String color;
     private int tip;
     
    // Using getters to access private variables
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
 
    void Setcolor(String newcolor) {
          color = newcolor;
    }
   void Settip(int NewTip){
         tip = NewTip;
   }
}