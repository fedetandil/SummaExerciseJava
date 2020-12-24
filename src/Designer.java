public class Designer extends Employee{

    private String type;

    public Designer(int id, String name, String lastName, int age,String type) {
        super(id, name, lastName, age);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Designer in='" + type+"'";
    }
}
