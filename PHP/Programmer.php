<?php

require_once "Employee.php";
class Programmer extends Employee
{
    private $language;

    public function __construct($id, $name, $lastName, $age,$language)
    {
        parent::__construct($id, $name, $lastName, $age);
        $this->language=$language;
    }


    public function getLanguage()
    {
        return $this->language;
    }


    public function setLanguage($language)
    {
        $this->language = $language;
    }

}




