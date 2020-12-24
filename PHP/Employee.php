<?php


class Employee
{
    private $id;
    private $name;
    private $lastName;
    private $age;

    public function __construct($id,$name,$lastName,$age){
        $this->id= $id;
        $this->name=$name;
        $this->lastName=$lastName;
        $this->age=$age;
    }


    public function getId()
    {
        return $this->id;
    }


    public function getName()
    {
        return $this->name;
    }


    public function setName($name)
    {
        $this->name = $name;
    }


    public function getLastName()
    {
        return $this->lastName;
    }


    public function setLastName($lastName)
    {
        $this->lastName = $lastName;
    }


    public function getAge()
    {
        return $this->age;
    }


    public function setAge($age)
    {
        $this->age = $age;
    }


}

