<?php

require_once "Programmer.php";
require_once "Designer.php";
class Company
{
    private $id;
    private $name;
    private $employees;

    public function __construct($id,$name){
        $this->id=$id;
        $this->name=$name;
        $this->employees= new ArrayObject();
    }


    public function getId()
    {
        return $this->id;
    }


    public function setId($id)
    {
        $this->id = $id;
    }


    public function getName()
    {
        return $this->name;
    }


    public function setName($name)
    {
        $this->name = $name;
    }


    public function getEmployees()
    {
        /*DEVUELVE UNA ARREGLO COPIA DE LOS EMPLEADOS*/
        return $this->employees->getArrayCopy();
    }

    public function addEmployee($employee){
        $exist=false;
        $index=0;
        /*RECORRE LA LISTA DE EMPLEADOS*/
        /*SI ENCUENTRA UNO CON EL MISMO ID DEJA DE RECORRER Y NO SE AGREGA*/
        /*CASO CONTRARIO AL FINALIZAR Y NO ENCONTRAR NINGUNO IGUAL, SE AGREGA*/
        while($index< sizeof($this->employees) && !$exist){
            if($this->employees->offsetGet($index)->getId()==$employee->getId()){
                $exist=true;
            }else{
                $index++;
            }
        }
        if(!$exist){
            $this->employees->append($employee);
        }
    }

    public function showEmployees(){
        $index=0;
        while($index< sizeof($this->employees)){
            var_dump($this->employees->offsetGet($index));
            $index++;
        }
    }

    public function getEmployee($id){
        $index=0;
        /*RECORRE LA LISTA DE EMPLEADOS*/
        /*SI ENCUENTRA UNO CON EL MISMO ID DEVUELVE ESE EMPLEADO*/
        /*CASO CONTRARIO AL FINALIZAR Y NO ENCONTRAR NINGUNO DEVUELVE NULL*/
        while($index< sizeof($this->employees)){
            if($this->employees->offsetGet($index)->getId()==$id){
                return $this->employees->offsetGet($index);
            }else{
                $index++;
            }
        }
       return null;
    }

    private function getTotalEmployees(){
        return sizeof($this->employees);
    }

    public function getAverageAgeOfEmployees(){
        $total=0;
        foreach($this->employees as $employee){
            $total+=$employee->getAge();
        }

        return $total/$this->getTotalEmployees();
    }



}




