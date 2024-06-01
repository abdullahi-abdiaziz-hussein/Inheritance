public class Student extends Human {

    private boolean hasLaptop;

    public Student(String name, int age, boolean hasLaptop) {
        super(name, age);
        this.hasLaptop = hasLaptop;
    }

    public boolean isHasLaptop() {
        return hasLaptop;
    }

    public void setHasLaptop(boolean hasLaptop) {
        this.hasLaptop = hasLaptop;
    }
}
