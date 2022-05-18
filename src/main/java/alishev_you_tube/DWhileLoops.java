package alishev_you_tube;

public class DWhileLoops { // cikl while
    public static void main(String[] args) {
        boolean t = true;
        boolean b = 5==4;
        System.out.println(t);
        System.out.println(b);

        int value = 10;
        boolean c = value > 5;
        System.out.println(c);

        int valueWhile = 11;
        while(valueWhile>5) {  //beskone4nyi cikl poka v skobkah true
            System.out.println("yes, 5 menshe " + valueWhile);
            valueWhile = valueWhile - 1; //vyhod iz beskone4nogo cikla

        }
    }
}
