package alishev_you_tube;

public class IBreak_Continue {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            if (i > 3) {  // без if () {break}
                break;     //    цикл будет выполнятся
            }              //       бесконечно
            System.out.println(i);
            i++;
        }
       System.out.println("мы вышли из цикла!");


        for(int k = 0; k <= 15; k++){
            if(k%2==0){  //если выполняется условие то входим обратно в цикл из-за continue;
                continue;
            }
            System.out.println("это нечетное число: " + k); //здесь выводится все что не подходит по условиям if
        }
    }
}
