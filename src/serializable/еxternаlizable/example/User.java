package serializable.еxternаlizable.example;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String lasName;
    private transient int age;

    public User(String name, String lasName, int age) {
        this.name = name;
        this.lasName = lasName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name - " + name + ", lasName - " + lasName + ", age - " + age;
    }
}
