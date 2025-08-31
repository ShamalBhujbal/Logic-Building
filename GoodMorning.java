import java.util.Scanner;
import java.time.LocalTime;

class GoodMorning {
    public static void main(String args[]) {
        LocalTime now = LocalTime.now(); 
        int time = now.getHour();        

        if (time >= 5 && time < 12)
            System.out.println("Good Morning");
        else if (time >= 12 && time < 16)
            System.out.println("Good Afternoon");
        else if (time >= 16 && time < 21)
            System.out.println("Good Evening");
        else
            System.out.println("Good Night");
    }
}
