import java.util.List;

public class Main {

    public static void main(String[] args) {
        //INSTANCIO LOS PROGRAMADORES
        Employee programmer1= new Programmer(1,"Federico","Aceto",30,"PHP");
        Employee programmer2= new Programmer(2,"Juan","Perez",27,"NET");
        Employee programmer3= new Programmer(3,"Javier","Romero",33,"PHP");
        Employee programmer4= new Programmer(4,"Marcos","Peña",22,"Python");
        //INSTANCIO LOS DISEÑADORES
        Employee designer1= new Designer(5,"Raul","Taibo",59,"Web");
        Employee designer2= new Designer(6,"Matias","Ale",47,"Grafico");
        Employee designer3= new Designer(7,"Lionel","Messi",10,"Web");
        //INSTANCIO LA EMPRESA
        Company summaSolutions= new Company(1,"Summa Solutions");

        //AGREGO LOS EMPLEADOS A LA EMPRESA
        summaSolutions.addEmployee(programmer1);
        summaSolutions.addEmployee(programmer2);
        summaSolutions.addEmployee(programmer3);
        summaSolutions.addEmployee(programmer4);
        summaSolutions.addEmployee(designer1);
        summaSolutions.addEmployee(designer2);
        summaSolutions.addEmployee(designer3);


        //OBTENGO LA LISTA DE EMPLEADOS Y LA IMPRIMO UTILIZANDO LA FUNCION toString DE LOS OBJETOS.
        List<Employee> employees= summaSolutions.getEmployees();

        for (Employee emp:employees
             ) {
            System.out.println(emp);
        }

        //OBTENGO Y MUESTRO EL PROMEDIO DE LA EDAD

        float averageAge= summaSolutions.getAverageAgeOfEmployees();
        System.out.println(averageAge);


        //BUSCO UN EMPLEADO POR ID Y LO MUESTRO, SI EXISTE LO IMPRIME, SINO MUESTRA NULL

        Employee emp= summaSolutions.getEmployee(3);
        System.out.println(emp);
        
    }
}
