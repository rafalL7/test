import java.util.Objects;

public class UserProfile {
    int id;
   static String firstName;
    String secondName;

    public UserProfile(int id, String firstName, String secondName) {
        this.id = id;
        UserProfile.firstName = firstName;
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        UserProfile.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(firstName, firstName) && Objects.equals(secondName, that.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }


}
