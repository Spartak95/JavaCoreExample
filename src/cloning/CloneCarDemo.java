package cloning;

public class CloneCarDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Грузовик", new Driver("Василий", 45));
        Car clonedCar = car.clone();
        System.out.println("Оригинал: " + car);
        System.out.println("Клон: " + clonedCar);
        clonedCar.setName("BMW");
        Driver clonedCarDriver = clonedCar.getDriver();
        clonedCarDriver.setName("Вася");
        clonedCarDriver.setAge(30);

        System.out.println("Оригинал после изменения имени водителя: " + car);
        System.out.println("Клон после изменения имени водителя: " + clonedCar);
    }
}
