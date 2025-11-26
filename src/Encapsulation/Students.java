package Encapsulation;

public class Students {

//    encapsulated
//    can only be accessed within the class
    private String name;
    private int age;
    private String address;


//    constructor
    public Students(String name,
                   int age,
                   String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

//    setters and getters
    public void setName(String name) {
        this.name  = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address  = address;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return ("Student name is " + this.getName() +
                ", age is: " + this.getAge() +
                " and their age is: " + this.getAddress());
    }
}
