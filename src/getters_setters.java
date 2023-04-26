public class getters_setters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(9);
        System.out.println(p1.getTip());

    }
  private static class Pen{
        String color;
        int tip;

        String getColor(){
            return color;
        }
        int getTip(){
            return tip;
        }

        void setColor(String newColor){
            this.color = newColor;
        }
        void setTip(int newTip){
            this.tip = newTip;
        }
    }
}
