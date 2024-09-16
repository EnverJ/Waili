package Java30Coding;

public class PrintPascalsTriangle {
    public static void main(String [] args){
        int rows=5;
        for( int i=0; i<rows; i++){
            int num=1;
            System.out.format("%" + (rows-i)*2 +"s", "");
            for( int j=0; j<=i; j++){
                System.out.format("%4d", num);
                num=num *(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
//Pascal’s Triangle is a triangular array of numbers where each number is the sum of the two numbers directly above it.
// It has applications in algebra, probability, and combinatorics.
//(rows - i) * 2 calculates the number of spaces needed for alignment.
//For example, when i = 0, (5 - 0) * 2 = 10 spaces.
//As i increases, the number of spaces decreases.
// System.out.format() is used to print formatted output
// "%Ns" where N is a number, prints a string (s) padded to width N.
//Calculating the Next Number:
//num = num * (i - j) / (j + 1);
//This formula computes the next number in the row based on the current num.
//It utilizes the properties of binomial coefficients.