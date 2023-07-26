// class Calculator {

//     int a;

//     public int add(int n1, int n2) {
//         // System.out.println("in add");
//         int r = n1 + n2;
//         return r;
//     }
// }

// public class oop {
//     public static void main(String a[]) {
//         int num1 = 4;
//         int num2 = 5;

//         Calculator calc = new Calculator();

//         int result = calc.add(num1, num2);

//         // int result = num1 + num2;

//         System.out.println(result);
//     }
// }

// class Computer {
//     public void playMusic() { // Use VOID when you are not expecting a return
//         System.out.println("Playing Music..");
//     }

//     public String getMeAPen(int cost) { // you need to specify the type of return here, i.e, int, string ect

//         if (cost >= 10) {
//             return "Pen";
//         } else {
//             return "Nothing";
//         }
//     }
// }

// public class oop {

//     public static void main(String[] args) {
//         Computer obj = new Computer();
//         obj.playMusic();
//         String str = obj.getMeAPen(1);
//         System.out.println(str);
//     }
// }

class Calculator {

    int num = 5;; // this is called an instance variable

    public int add(int n1, int n2) // These in the brackets are called local variables

    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)

    {
        return n1 + n2 + n3;
    }
}

// Having 2 methods of the same name but with different parameters (i.e add 2 or
// add 3 numbers) is called METHOD OVERLOADING

public class oop {
    public static void main(String a[]) {

        int data = 10;

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        int r1 = obj.add(3, 4);

        System.out.println("results = " + r1);

        obj.num = 8;

        System.out.println("obj = " + obj.num);
        System.out.println("obj1 = " + obj1.num);

    }
}