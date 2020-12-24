import java.util.ArrayList;
import java.util.List;

public class Company {

    private int id;
    private String name;
    private List<Employee> employees;

    public Company(int id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
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

    public void addEmployee(Employee emp){
      // COMPRUEBA QUE EL EMPLEADO NO EXISTA EN LA LISTA DE EMPLEADOS
        // SI NO EXISTE, LO AGREGA
        if(!this.employees.contains(emp)){
            this.employees.add(emp);
        }
    }

    private int getTotalEmployees(){
        //DEVUELVE LA CANTIDAD DE EMPLEADOS DE LA EMPRESA
        return this.employees.size();
    }

    public Employee getEmployee(int id){
        for (Employee emp: employees) {
            //COMPRUEBA SI EN LA LISTA UN EMPLEADO TIENE EL ID BUSCADO
            //SI LO ENCUENTRA DEVUELVE EL EMPLEADO
            if(emp.getId()==id){
                return emp;
            }
        }
        // EN EL CASO DE NO HABERLO ENCONTRADO, RETORNA NULL
        return null;
    }

     public List<Employee> getEmployees(){
        //DEVUELVE UNA COPIA DE LA LISTA DE EMPLEADOS
        return new ArrayList<>(this.employees);
     }

     public float getAverageAgeOfEmployees(){
        float total=0;
         for (Employee emp: employees) {
            total+=emp.getAge();
         }

         return total/this.getTotalEmployees();
     }
}
