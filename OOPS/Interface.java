package OOPS;
public class Interface {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        
    }
    
}
  interface chessplayer{
void moves();
}
class Queen implements chessplayer  {

   public  void moves(){
        System.out.println("Up,Down,Left,Right,Diagonal");
    }
}
class Rook implements chessplayer  {

   public  void moves(){
        System.out.println("Up,Down,Left,Right,Diagonal(all in one)");
    }
}

class king implements chessplayer  {

   public  void moves(){
        System.out.println("Up,Down,Left,Right,Diagonal");
    }
}