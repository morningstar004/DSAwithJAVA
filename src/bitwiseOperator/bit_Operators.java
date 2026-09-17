package bitwiseOperator;

public class bit_Operators {
    static void main() {
        int a = 12;
        int b = 10;

        int AndResult = a & b;
        int OrResult = a | b;
        int NotResult = ~a;
        int XorResult = a ^ b;
        int leftShiftResult = a << 1;
        int rightShiftResult = a >> 1;
        int unsignedRightShift = a >>> 1;

        System.out.println(AndResult);
        System.out.println(OrResult);
        System.out.println(NotResult);
        System.out.println(XorResult);
        System.out.println(leftShiftResult);
        System.out.println(rightShiftResult);
        System.out.println(unsignedRightShift);
    }
}
