public class VariableTypes {
    public static void main(String[] args) {
        // One variable of each primitive type
        byte    myByte    = 100;
        short   myShort   = 30000;
        int     myInt     = 2_000_000;
        long    myLong    = 9_000_000_000L;
        float   myFloat   = 3.14f;
        double  myDouble  = 3.141592653589793;
        char    myChar    = 'K';
        boolean myBoolean = true;

        System.out.println("byte:    " + myByte);
        System.out.println("short:   " + myShort);
        System.out.println("int:     " + myInt);
        System.out.println("long:    " + myLong);
        System.out.println("float:   " + myFloat);
        System.out.println("double:  " + myDouble);
        System.out.println("char:    " + myChar);
        System.out.println("boolean: " + myBoolean);

        // Final constant — try to change it and the compiler will throw an error
        final int MAX_SCORE = 100;
        System.out.println("\nMAX_SCORE = " + MAX_SCORE);

        // Uncommenting the line below causes:
        // error: cannot assign a value to final variable MAX_SCORE
        // MAX_SCORE = 200;
    }
}
