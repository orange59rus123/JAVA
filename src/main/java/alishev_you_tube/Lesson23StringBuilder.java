package alishev_you_tube;

import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import java.util.Locale;

public class Lesson23StringBuilder {
    public static void main(String[] args) {
        String x = "hello";

        System.out.println(x);
        x = x.toUpperCase(); // toUpperCase() из маленьких букв делает загавные но нужно присвоить переменной
        System.out.println(x);


        String s1 = "Hello";
        String s2 = " my";
        String s3 = " friend";
        String sAll = s1 + s2 + s3;
        System.out.println(sAll);

               //StringBuilder для быстроты при прибавлении строк
        StringBuilder sb = new StringBuilder("Hello StringBuilder");
        System.out.println(sb.toString());
        sb.append(" plus String1");      //прибавление к строке StringBuilder
        sb.append(" and plus String2");  //прибавление к строке StringBuilder
        System.out.println(sb.toString());
        sb.append(" plus String3").append(" and plus String4");  //  укоротили
        System.out.println(sb.toString());

    }
}
