// changing the type of the variable

class conversion_and_casting {
    public static void main(String args[]) {

        byte b = 127;

        int a = 257;

        // a = b;

        // b = a; // integer has a bigger range than byte therefore you cannot convert
        // something big into something small.

        System.out.println(a);

        byte c = (byte) a; // The format in the () is what you are converting the variable type to, but
                           // this need to be within the parameters of the original variable, this type of
                           // conversion is called casting.

        System.out.println(c);

        int d = 257;

        byte e = (byte) d;

        System.out.println(e); // The format in the () is what you are converting the variable type to, but
                               // this need to be within the parameters of the original variable, this type of
                               // conversion is called casting.

        float f = 5.6f;

        int g = (int) f; // when converting from float (decimal numbers) to integers you lose the decimal
                         // value and are only left with the whole number.

        System.out.println(g);

        // Type promotion - java will automatically change the variable type to the type
        // you specify for the result.

        byte h = 10;
        byte i = 30;

        int result = h * i;

        System.out.println(result);

    };
}
