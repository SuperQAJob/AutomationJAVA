import org.testng.annotations.Test;

public class FirstClass {

    @Test
    public void testMyFirstTest() {
        System.out.println("Hello, World!");
    }

    @Test
    public void testNumbers() {
        int myNumber;
        myNumber = 5;

        System.out.println(myNumber);
    }

    @Test
    public void testConcatenation() {
        String s1 = "I study ";
        String s2 = "Java";

        String s3 = s1 + s2;

        System.out.println(s3);
    }

    @Test
    public void testConcatenation02() {
        String messagePrefix = "I study ";
        String messageSuffix = "Java";
        int numberForMessage = 3;

        String s3 = messagePrefix + numberForMessage + messageSuffix;

        System.out.println(s3);
    }

    @Test
    public void testClicks() {
        String msgFirst = "I clicked ";
        String msgLast = " times";
        int numOfClicks = 5;

        System.out.println(msgFirst + numOfClicks + msgLast);
    }


    @Test
    public void testBoolean() {
        boolean b = true;
        boolean toBe = false;

        b = toBe || !toBe;

        if (true) {
            System.out.println(toBe);
        }
    }

    @Test
    public void testIfStatement() {
        boolean isElementVisible = true;

        if (isElementVisible) {
            System.out.println("Click on the Element");
        } else {
            System.out.println("Wait until it will be visible");
        }
    }

    @Test
    public void testArrays() {
        int[] arrayOfIntegers = {1, 2, 3, 4, 5};
//        System.out.println(arrayOfIntegers[0]);
//        System.out.println(arrayOfIntegers[1]);
//        System.out.println(arrayOfIntegers[2]);
//        System.out.println(arrayOfIntegers[3]);
//        System.out.println(arrayOfIntegers[4]);

        for(int i = 0; i < arrayOfIntegers.length; i++) {
            System.out.println(arrayOfIntegers[i]);
        }
    }
}
