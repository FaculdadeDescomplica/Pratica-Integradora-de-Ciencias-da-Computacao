public class RefDesign {

    //    Antes:
    static int calculate(int a, int b) {
        return a + b;
    }

    //  Depois:
    static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        System.out.println("Refinamento Design");
        System.out.println("Calculate = " + calculate(10,5));
        System.out.println("Calculate Sum = " + calculateSum(10,5));

    }

}
