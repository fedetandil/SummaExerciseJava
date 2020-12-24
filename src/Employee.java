public class Employee {
    private int id;
    private String name;
    private String lastName;
    private int age;

    public Employee(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    // setID no está definido porque considero que los IDS son unicos
    // y no deberian poder modificarse

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object obj){
        try{
            Employee emp= (Employee) obj;
            return emp.getId() == this.getId();
        }catch (Exception e){
            return false;
        }
    }


    @Override
    public String toString() {
        return "Employee: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age;
    }
}
