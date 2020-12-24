<?php
require_once "Company.php";

$company = new Company(1,"Summa Solutions");


$programmer1= new Programmer(1,"Federico","Aceto",30,"PHP");
$programmer2= new Programmer(2,"Juan","Perez",27,"NET");
$designer1= new Designer(5,"Raul","Taibo",59,"Web");
$designer2= new Designer(6,"Matias","Ale",47,"Grafico");

$company->addEmployee($programmer1);
$company->addEmployee($programmer2);
$company->addEmployee($designer1);
$company->addEmployee($designer2);

/*TEST POR VAR DUMPS*/

echo("---------------PROMEDIO DE EDAD------------------");
var_dump($company->getAverageAgeOfEmployees());
echo("---------------LISTA DE EMPLEADOS------------------");
var_dump($company->getEmployees());
echo("---------------BUSCA EL EMPLEADO CON ID 1------------------");
var_dump($company->getEmployee(1));
echo("---------------BUSCA EL EMPLEADO CON ID 9 (NO EXISTE)------------------");
var_dump($company->getEmployee(9));


