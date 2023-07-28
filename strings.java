class Mobile {
    String brand;
    int price;
    static String name;

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println(" in constructor");
    }

    static {
        name = "Phone";
        System.out.println(" in static block");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class strings {
    public static void main(String[] args) throws ClassNotFoundException {
        // // String name = new String("Yusuf"); // This is too extra
        // String name = "Yusuf"; // This is standard practice

        // System.out.println("Hello " + name);
        // System.out.println(name.hashCode()); // Shows the HashCode of the variable
        // System.out.println(name.charAt(1));// Shows the character at the position in
        // the brackets of the variable
        // System.out.println(name.concat(" Ayyub")); // add to the end of the variable

        // // ---------------- String Buffer

        // StringBuffer sb = new StringBuffer("Yusuf");
        // sb.append(" Ayyub"); // adds to the string
        // sb.deleteCharAt(2); // Deleted character at certain position
        // sb.insert(5, "Java "); // inserts at position of the string
        // sb.setLength(30); // to set maximum length of string
        // sb.ensureCapacity(30);

        // System.out.println(sb);

        Class.forName("Mobile");

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1500;
        obj1.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1700;
        obj2.name = "Smart Phone";

        obj1.show();
        obj2.show();

    }
}
