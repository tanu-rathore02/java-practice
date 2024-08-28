public class ExceptionHandling {

    public static void main(String[] args) {

        tryCatchPractice();


        nestedTryBlockPractice();


        multipleCatchBlockPractice();


        finallyBlockPractice();


        throwKeywordPractice();


        try {
            throwsKeywordPractice();
        } catch (Exception e) {
            System.out.println("Exception in throwsKeywordPractice: " + e.getMessage());
        }
    }

    //Try catch block
    static void tryCatchPractice() {
        try {
            int result = 10 / 0; //  ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }

    //Nested try block
    static void nestedTryBlockPractice() {
        try {
            String[] array = {"A", "B", "C"};
            try {
                int num = Integer.parseInt(array[3]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 2:  " + e.getMessage());
        }
    }

    // Multiple catch block
    static void multipleCatchBlockPractice() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("generic Exception: " + e.getMessage());
        }
    }

    //finally block
    static void finallyBlockPractice() {
        try {
            int result = 10 / 2;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Always executible block.");
        }
    }

    // 5. Throw Keyword
    static void throwKeywordPractice() {
        int age = 15;
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
        System.out.println("Age is valid.");
    }

    //Throws Keyword
    static void throwsKeywordPractice() throws Exception {
        String str = null;
        if (str == null) {
            throw new Exception("String cannot be null.");
        }
        System.out.println("String is: " + str);
    }
}