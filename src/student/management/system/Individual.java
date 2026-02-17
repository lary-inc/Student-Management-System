package student.management.system;

// Abstract base class for all individuals
public abstract class Individual {

    private String fullName; // Encapsulation

    public Individual(String fullName) {
        this.fullName = fullName;
    }

    // Getter
    public String getFullName() {
        return fullName;
    }
    // Setter
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Abstract method for polymorphism
    public abstract void showProfile();
}

