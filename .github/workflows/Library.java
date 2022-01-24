public class Library {
    public static void main(String[] args) {
        UserProfile userprofile = new UserProfile(1, "Rafał", "Sarnecki");

        System.out.println(userprofile.getId() + " " + userprofile.getFirstName() + " " + userprofile.getSecondName());
        String name = userprofile.getFirstName();
        System.out.println(name);
    }
}
