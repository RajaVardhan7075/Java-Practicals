public class EncapsulationDemo {

    // Private data members
    private int id;
    private String name;

    // Setter method for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for id
    public int getId() {
        return id;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();

        // Setting values using setter methods
        obj.setId(101);
        obj.setName("Siddu");

        // Getting values using getter methods
        System.out.println("Student ID = " + obj.getId());
        System.out.println("Student Name = " + obj.getName());
    }
}
