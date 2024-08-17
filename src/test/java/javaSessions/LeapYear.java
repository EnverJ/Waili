package javaSessions;

public class LeapYear {
    public static void leapyear(int year){
        //leap year or not
        boolean isLeapyear= (year % 4 ==0 && year %100 !=0 ||year % 400 ==0);
         if(isLeapyear) {
             System.out.println("Yes");
         }
         else{
             System.out.println("No");
         }

    }
    public static void main(String[] args){
        leapyear(2000);
    }
}
