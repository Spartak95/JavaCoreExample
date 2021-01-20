package cloning;

public class Car implements Cloneable {
    private String name;
    private Driver driver;

    public Car(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car name = " + name + ", driver = " + driver;
    }

//    մակերևույթային կլոնավորում
//    @Override
//    public Car clone() throws CloneNotSupportedException {
//        return (Car) super.clone();
//    }

    // խորը կլոնավորում
       @Override
       public Car clone() throws CloneNotSupportedException {
          Car newCar = (Car) super.clone();
          Driver driver = this.getDriver().clone();
          newCar.setDriver(driver);
          return newCar;
      }
}
