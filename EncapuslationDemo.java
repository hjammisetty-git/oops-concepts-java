class Employee {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setName("Himaja");

        System.out.println(e.getId() + " - " + e.getName());
    }
}
