//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1

        int age = 21;
        if (age<=17) {
            System.out.println("Если возраст человека равен "+age+", то  он не достиг совершеннолетия, нужно немного подождать.");
        } else {
            System.out.println("Если возраст человека равен"+age+", то  он соврешеннолетний.");
        }

        //2

        double temp = 25.8d;
        if (temp<=5){
            System.out.println("На улице "+temp+" градусов, нужно надеть шапку");
        } else {

            System.out.println("На улице "+temp+" градусов, можно идти без шапки");
        }
    }
}
