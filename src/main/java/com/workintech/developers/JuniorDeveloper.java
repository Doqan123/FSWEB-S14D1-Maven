package com.workintech.developers;

public class JuniorDeveloper extends  Employee{


    public JuniorDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("Junior developer starts to working");
    }
}
