package Class_two;

public class Associativity {
    public static void main(String[] args) {
        //associativity refers to the order in which operators of the same precedence are evaluated in an expression.

//         postfix increment and decrement	++ --	left to right
//        prefix increment and decrement, and unary	++ -- + - ~ !	right to left
//        multiplicative	* / %	left to right
//        additive	+ -	left to right
//        shift	<< >> >>>	left to right
//        relational	< > <= >= instanceof	left to right
//        equality	== !=	left to right
//        bitwise AND	&	left to right
//        bitwise exclusive OR	^	left to right
//        bitwise inclusive OR	|	left to right
//        logical AND	&&	left to right
//        logical OR	||	left to right
//        ternary	? :	right to left
//        assignment	= += -= *= /= %=
//		    &= ^= |= <<= >>= >>>=	right to lef

        float num = 7 / 4 * 9 / 2; //output will wrong => 4.0
        float nums = 7 / 4.0F * 9 / 2.0F;
        System.out.println(nums);// correct answer => 7.875

    }
}