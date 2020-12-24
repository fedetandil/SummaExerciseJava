<?php

require_once "Employee.php";
class Designer extends Employee
{
    private $type;

    public function __construct($id, $name, $lastName, $age,$type)
    {
        parent::__construct($id, $name, $lastName, $age);
        $this->type= $type;
    }


    public function getType()
    {
        return $this->type;
    }


    public function setType($type)
    {
        $this->type = $type;
    }


}
