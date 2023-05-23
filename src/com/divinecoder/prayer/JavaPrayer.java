package com.divinecoder.prayer;

public class JavaPrayer {
    public static void main(String[] bugs) throws InterruptedException {
        String prayer = "Our Java, who art in bytecode,\n" +
                "hallowed be thy objects,\n" +
                "thy methods come,\n" +
                "thy will be done,\n" +
                "on IntelliJ as it is in Eclipse.\n" +
                "Give us this day our daily debugging,\n" +
                "and forgive us our null pointer exceptions,\n" +
                "as we forgive those who catch them.\n" +
                "Lead us not into memory leaks,\n" +
                "but deliver us from checked exceptions.\n" +
                "For thine is the JVM, the garbage collector,\n" +
                "and the inheritance hierarchy, forever and ever.\n\n" +
                "In the name of classes, interfaces, and polymorphism, amen.";

        char[] chars = prayer.toCharArray();
        for (char c : chars) {
            System.out.print(c);
            Thread.sleep(100); // Delay between printing each character

        }
    }
}
