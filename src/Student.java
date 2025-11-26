public class Student {

    String name;
    int age;
    String address;


//    constructor
    public Student (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

//    setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }


//    main function
    public static void main (String[] args) {
        Student john = new Student("John", 36, "Kenya");
        System.out.println("Name: " + john.getName());
        System.out.println("Age: " + john.getAge());
        System.out.println("Address: " + john.getAddress());
    }
}

