package serializable.еxternаlizable.example;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;

public class User2 implements Externalizable {
    private String firstName;
    private String lastName;
    private String superSecretInformation;

    public User2() {
    }

    public User2(String firstName, String lastName, String superSecretInformation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.superSecretInformation = superSecretInformation;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
         out.writeObject(firstName);
         out.writeObject(lastName);
         out.writeObject(encryptString(superSecretInformation));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName = (String) in.readObject();
        lastName = (String) in.readObject();
        superSecretInformation = decryptString((String) in.readObject());
    }

    private String encryptString(String data) {
         String encryptedData = Base64.getEncoder().encodeToString(data.getBytes());
         System.out.println(encryptedData);
         return encryptedData;
    }

    private String decryptString(String data) {
         String descryptData = new String(Base64.getDecoder().decode(data));
         System.out.println(descryptData);
         return descryptData;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuperSecretInformation() {
        return superSecretInformation;
    }

    @Override
    public String toString() {
        return "firstName = " + firstName + ", lastName = " + lastName +
                ", superSecretInformation = " + superSecretInformation;
    }
}
