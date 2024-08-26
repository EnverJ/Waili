package javacollections;

public class MethodOverriding {

    public void Car(String car, int year) {

        System.out.println(car + " :" + year);
    }

    public static class Tesla extends MethodOverriding {

        @Override
        public void Car(String car, int year) {
            System.out.println(car + "" + year);

        }

        public static void main(String[] args) {
            MethodOverriding methodOverriding = new MethodOverriding();
            methodOverriding.Car("Toyota", 2018);
            MethodOverriding methodOverriding2 = new Tesla();
            methodOverriding2.Car("Model y", 23);
        }

    }
}
