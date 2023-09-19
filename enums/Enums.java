// enum Status {
//     Running, Failed, Pending, Success
// }

enum Laptop {
    Macbook(2000), XPS(2200), Surface, Thinkpad(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop() {
        price = 500;
    }

}

class Enums {
    public static void main(String[] args) {

        // Status s = Status.Running;
        // Status[] ss = Status.values();

        // System.out.println(s);
        // System.out.println(ss[3]);

        // for (Status s1 : ss) {
        // System.out.println(s1 + " : " + s1.ordinal());
        // }

        // Status s = Status.Pending;

        // if (s == Status.Running) {
        // System.out.println("All Good");
        // } else if (s == Status.Failed) {
        // System.out.println("Try Again");
        // } else if (s == Status.Pending) {
        // System.out.println("Please Wait");
        // } else {
        // System.out.println("Done");
        // }

        // switch (s) {
        // case Running:
        // System.out.println("All Good");
        // break;
        // case Failed:
        // System.out.println("Try Again");
        // break;
        // case Pending:
        // System.out.println("Please Wait");
        // break;
        // default:
        // System.err.println("Done");
        // break;
        // }

        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + ": " + lap.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + ": " + lap.getPrice());

        }
    }
}