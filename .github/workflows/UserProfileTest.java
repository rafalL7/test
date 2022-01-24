import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class UserProfileTest {


    @org.junit.jupiter.api.Test
    void getId() {
    }

    @org.junit.jupiter.api.Test
    void setId() {

    }

    @org.junit.jupiter.api.Test
    String getFirstName() {
        return "raf";
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {

    }

    @org.junit.jupiter.api.Test
    void getSecondName() {
    }

    @org.junit.jupiter.api.Test
    void setSecondName() {
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }


    void name() {
    }

    public UserProfileTest() {
        super();
    }

    @AfterAll
    public static void afterAll() {
        UserProfile range = new UserProfile(10, "raf", "sarnecki");
        System.out.println(range.getId() + " " + range.getFirstName() + " " + range.getSecondName());
        String name = range.getFirstName();
        System.out.println(name);
    }

    @Test
    //@org.junit.jupiter.api.Test
    public void shouldSayThat15rIsInRange() {
        UserProfile range = new UserProfile(10, "after", "all");

        System.out.println(range.getId() + " " + range.getFirstName() + " " + range.getSecondName());
        String name = range.getFirstName();
        System.out.println(name);


    }
}