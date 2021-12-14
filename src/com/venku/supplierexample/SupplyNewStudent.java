package com.venku.supplierexample;

public class SupplyNewStudent {

    private int id;
    private String name;
    private String gender;
    private int age;


    public  SupplyNewStudent(int id, String name , String gender , int age){
super();
this.id=id;
this.age=age;
this.gender=gender;
this.name=name;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SupplyNewStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
