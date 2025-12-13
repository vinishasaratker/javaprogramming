public class interfacing {
    public static void main(String[] args) {
       queen q=new queen();
       q.moves(); 
    }
}
interface  chessplayer{
    void moves();
}
class queen implements chessplayer{
    public void moves(){
        System.out.println(" hii this is queen");
    }
}
class king implements chessplayer{
    public void moves(){
        System.out.println(" hii this is   your king ");
    }
}
class baby  implements chessplayer{
    public void moves(){
        System.out.println(" hyyy baby ");
    }
}