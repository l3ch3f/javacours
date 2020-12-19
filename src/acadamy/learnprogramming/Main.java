package acadamy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        
        // int occupies 32 bits
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Overflow also recurs on reverse of minimum val and is called underflow.
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));

        // smaller bytes datatype for performance Byte occupies 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);
        
        // a bit bigger than bytes occuppies 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        // the biggest and will take 64 bits
        // a long needs a capital L otherwise error.
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        // Casting is revert a number into another type.
        int myTotal = (myMinIntValue / 2);
        // casting in practice:
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue/2);
    }
}
