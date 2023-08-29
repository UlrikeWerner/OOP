public class Main {
    public static void main(String[] args) {
        /*Car myCar = new Car();
        myCar.startCar();

        Car secondCar = new Car();
        System.out.println(secondCar.toString());
        secondCar.startCar();
        secondCar.accelerateCar(20);
        secondCar.getSpeed();
        secondCar.brakeCar(-10);
        secondCar.getSpeed();
        secondCar.brakeCar(50);
        secondCar.getSpeed();

        Car newCar = new Car("Audi", "CorsaC", "red", 2019);
        System.out.println(newCar.toString());*/
        Person anna = new Person("Anna", 21, "weiblich", "England");
        Person chris = new Person("Chris", 45);
        Person claudia = new Person("Claudia");
        Person max = new Person("Max", 35, "divers");

        anna.greeting();
        chris.greeting();
        claudia.greeting();
        max.greeting();
    }
}
