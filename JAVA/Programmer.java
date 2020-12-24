public class Programmer extends Employee{

    private String language;

    public Programmer(int id, String name, String lastName, int age,String language) {
        super(id, name, lastName, age);
        this.language=language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Programmer in='" + language+"'";
    }
}
