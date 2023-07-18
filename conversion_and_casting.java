// changing the type of the variable

class conversion_and_casting {
    public static void main(String args[]) {

        byte b = 127;

        int a = 257;

        // a = b;

        // b = a; // integer has a bigger range than byte therefore you cannot convert
        // something big into something small

        System.out.println(a);

        byte j = (byte) a; // The format in the () is what you are converting the variable type to, but
                           // this need to be within the parameters of the original variable, this type of
                           // conversion is called casting.

        System.out.println(j);

        int d = 257;

        byte k = (byte) d;

        System.out.println(k); // The format in the () is what you are converting the variable type to, but
                               // this need to be within the parameters of the original variable, this type of
                               // conversion is called casting.

        int c = 12;

        System.out.println(b);

        b = (byte) c;

        System.out.println(b);

        float f = 5.6f;

        int x = (int) f; // when converting from float (decimal numbers) to integers, you lose the
                         // decimal value and are only left with the whole number

        System.out.println(x);
    };
}
