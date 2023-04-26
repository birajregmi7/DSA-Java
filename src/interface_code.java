public class interface_code {
    public static void main(String[] args) {
        King k = new King();
        k.moves();
    }
    interface chessPlayer{
        void moves();
    }
    class Queen implements chessPlayer{
        public void moves() {
            System.out.println("up,down,left,right,diagonal");
        }
    }
    class Rook implements chessPlayer{
        public void moves(){
            System.out.println("up,down,right,left");
        }
    }
    static class King implements chessPlayer{
        public void moves(){
            System.out.println("up,down,right,left,diagonal but only 1 step");
        }
    }
}
