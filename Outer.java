class Outerclass{
    int x=100;
    class Innerclass{
        int y=200;
    }
}
public class Outer{
    public static void main(String []args){
        Outerclass out = new Outerclass();
        Outerclass.Innerclass in = out.new Innerclass();

        System.out.println("Sum = "+(out.x + in.y));
    }
}

