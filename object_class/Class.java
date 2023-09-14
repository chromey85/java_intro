class Laptop {

    String model;
    int price;

    // OLD CODE
    //
    // public String toString() {
    // return model + " + " + price;
    // }
    //
    // public boolean equals(Laptop that){
    // (this.model.equals(that.model)) && (this.price == that.price) ? true : false;
    // }
    //
    // VSCode `Generate toString()` and `Generate hashCode() and equals()` version
    // of the above
    //

    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}

public class Class {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);

        System.out.println(obj1); // by default, it returns .toString which returns the HASH of the data
        System.out.println(obj2);
        System.out.println(result); // by default, it returns .toString
    }
}