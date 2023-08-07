class Human {
    private int age;
    private String name;

    // public Human() { // this is a Default Constructor
    // age = 4;
    // name = "Jasmine";
    // }

    // public Human(int a, String n) { // this is a Parameterized Constructor
    // age = a;
    // name = n;
    // }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        // Human obj1 = new Human(8, "Gabriel");

        System.out.println(obj.getName() + " : " + obj.getAge());
        // System.out.println(obj1.getName() + " : " + obj1.getAge());

        // obj.setAge(30);
        // obj.setName("Yusuf");

        // System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
