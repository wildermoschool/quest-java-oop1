public class Wilder {
    // attributes
    private String firstName;
    private boolean present;

    // constructors
    public Wilder(String firstName, boolean present) {
        this.firstName = firstName;
        this.present = present;
    }
    // getters
    public String getFirstName() {
        return this.firstName;
    }
    public boolean isPresent() {
        return this.present;
    }
    // setters
    public void setFirstName(String name) {
        this.firstName = name;
    }
    public void setPresent(boolean present) {
        this.isPresent();
    }
    // instance method
    public String whoAmI() {
        if (present == true) {
            return "My name is " + this.firstName + " and I'm present";
        } else {
            return "My name is " + this.firstName + " and I'm not present";
        }
    }
}
