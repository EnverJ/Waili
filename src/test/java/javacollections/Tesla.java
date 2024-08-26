package javacollections;

public class Tesla extends Car {
    public void brand(String Toyota, String Color) {
        System.out.println(Toyota + "" + Color + "");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.brand("Prysx ", "White");
        Car car2 = new Tesla();
        car2.brand("Tesla Model Y ", "black");


    }
}
