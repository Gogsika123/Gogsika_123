import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value for hours between 0 and 11: ");
        int hours = input.nextInt();
        System.out.print("Enter the value for minutes between 0 and 59: ");
        int minutes = input.nextInt();
        if (hours < 0 || hours > 11 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid input. Hours should be between 0 and 11, and minutes should be between 0 and 59.");}
        else {
            int minutesDegree = minutes * 6; //find starting minutes degree position from 12
            int hoursDegree = hours * 30 + (minutesDegree / 12); //find starting hours degree from 12
            double minutesPosition = hoursDegree + 180 + ((180 - hoursDegree) * 6 / 12);//find minute degree for straight line
            double hoursPosition = hoursDegree + (minutesPosition - minutesDegree) / 12;//find hour degree for straight line
           int hourTime = (int)hoursPosition / 30;
           int minuteTime = (int)minutesPosition / 6;
           if (minuteTime > 59) System.out.println("Arrows will make straight line when it will be approximately " + hourTime + " hour and " + (minuteTime - 60) + "minute.");
           else System.out.println("Arrows will make straight line when it will be approximately " + hourTime + " hour and " + minuteTime + " minute");



        }



    }
}