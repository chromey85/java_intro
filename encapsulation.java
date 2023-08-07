class Human {
    private int age;
    private String name;

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

public class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Yusuf");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
