package cloning;

public class ObjectClone implements Cloneable{
    public String name;
    public int a;

    public ObjectClone(String name, int age) {
        this.name = name;
        this.a = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
