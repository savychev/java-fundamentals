package be.intecbrussel.les2;

public class WrapperClasses {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 30;
        long myLong = 40;
        float myFloat = 50.0F;
        double MyDouble = 60.0D;
        char myChar = 'a';
        boolean myBoolean = true;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(MyDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);

        System.out.println("---");

        //Autoboxing: Converting primitieve naar objecten
        Byte byteobj = myByte;
        Short shortobj = myShort;
        Integer intobj = myInt;
        Long longobj = myLong;
        Float floatobj = myFloat;
        Double doubleobj = MyDouble;
        Character charobj = myChar;
        Boolean boolobj = myBoolean;

        System.out.println(byteobj);
        System.out.println(shortobj);
        System.out.println(intobj);
        System.out.println(longobj);
        System.out.println(floatobj);
        System.out.println(doubleobj);
        System.out.println(charobj);
        System.out.println(boolobj);

        System.out.println("---");

        //Unboxing: Converting Objects to Primitives
        byte bytevalue = byteobj;
        short shortvalue = shortobj;
        int intvalue = intobj;
        long longvalue = longobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        boolean boolvalue = boolobj;

        System.out.println(bytevalue);
        System.out.println(shortvalue);
        System.out.println(intvalue);
        System.out.println(longvalue);
        System.out.println(floatvalue);
        System.out.println(doublevalue);
        System.out.println(charvalue);
        System.out.println(boolvalue);
    }
}
