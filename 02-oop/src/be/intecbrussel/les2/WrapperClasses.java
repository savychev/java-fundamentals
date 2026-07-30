package be.intecbrussel.les2;

/**
 * Wrapper-klassen: elk primitief type heeft een object-tegenhanger
 * (int -> Integer, char -> Character, ...).
 * Autoboxing en unboxing gebeuren automatisch.
 */
public class WrapperClasses {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 30;
        long myLong = 40;
        float myFloat = 50.0F;
        double myDouble = 60.0D;
        char myChar = 'a';
        boolean myBoolean = true;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);

        System.out.println("---");

        // Autoboxing: primitieven worden automatisch objecten
        Byte byteObj = myByte;
        Short shortObj = myShort;
        Integer intObj = myInt;
        Long longObj = myLong;
        Float floatObj = myFloat;
        Double doubleObj = myDouble;
        Character charObj = myChar;
        Boolean boolObj = myBoolean;

        System.out.println(byteObj);
        System.out.println(shortObj);
        System.out.println(intObj);
        System.out.println(longObj);
        System.out.println(floatObj);
        System.out.println(doubleObj);
        System.out.println(charObj);
        System.out.println(boolObj);

        System.out.println("---");

        // Unboxing: objecten worden automatisch weer primitieven
        byte byteValue = byteObj;
        short shortValue = shortObj;
        int intValue = intObj;
        long longValue = longObj;
        float floatValue = floatObj;
        double doubleValue = doubleObj;
        char charValue = charObj;
        boolean boolValue = boolObj;

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(boolValue);
    }
}
