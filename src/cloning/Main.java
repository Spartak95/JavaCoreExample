package cloning;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectClone objectClone = new ObjectClone("A", 2);
            ObjectClone objectClone2 = (ObjectClone) objectClone.clone();
            objectClone2.name = "B";
            objectClone2.a = 12;
            System.out.println(objectClone.name);
            System.out.println(objectClone2.name);
            System.out.println(objectClone.a);
            System.out.println(objectClone2.a);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
