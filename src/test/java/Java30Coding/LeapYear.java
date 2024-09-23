package Java30Coding;

public class LeapYear {
    public static void main(String [] args){
        int year=2024;
        boolean isLeap= (year%4==0 && year%100!=0)||(year%400==0);
        System.out.println(isLeap);
    }
}
//	If a year is divisible by 4 but not by 100, it is a leap year.
//	•	If a year is divisible by 100 but not by 400, it is not a leap year.
//	•	If a year is divisible by 400, it is a leap year.