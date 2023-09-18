interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }

}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run: FASTER");
    }
}

class Developer {
    public void devApp(Computer lap) {
        // System.out.println("Coding...");
        lap.code();
    }
}

public class Interface2 {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer Yusuf = new Developer();
        Yusuf.devApp(lap);
    }
}