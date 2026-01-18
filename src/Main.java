//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1

        int age = 21;
        if (age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то  он не достиг совершеннолетия, нужно немного подождать.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то  он соврешеннолетний.");
        }

        //2

        double temp = 25.8d;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {

            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        //3
        int fast = 120;
        if (fast <= 60) {
            System.out.println("«Если скорость " + fast + " км/ч,то можно ездить спокойно».");
        } else {
            System.out.println("«Если скорость " + fast + " км/ч,то придется заплатить штраф.");
        }

        //4
        int peopleAge = 22;
        boolean peopleAgeIsNotSeven = peopleAge >= 2 && peopleAge <= 6;
        boolean peopleAgeIsMoreSix = peopleAge > 6 && peopleAge <= 17;
        boolean peopleAgeIsMore18 = peopleAge >= 18 && peopleAge <= 24;
        if (peopleAgeIsNotSeven) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в детский сад");
        }
        else if (peopleAgeIsMoreSix) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в школу");
        }
         else if (peopleAgeIsMore18) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить на работу");
        }


    }
    }

