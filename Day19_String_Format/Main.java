package Day19_String_Format;
/* Day 19:
* A program which manipulates strings using string format to make patterns
*
* This is a fairly simple task, I've seen it being given as an exercise in my textbook, but it's normally
* done by constantly creating new strings of different lengths or appending spaces to a StringBuffer.
* */

public class Main {
    public static void main(String[] args) {
        double number = 1;
        char letter = 'A';
        String format;

        for (int i = 1; i < 10; i++) {
            format = "%"+(i)+"c %"+(11-i)+".0f "+"%"+(11-i)+"c"+"%n";
            System.out.printf(format, letter, number, letter);
        }
        for (int i = 10; i > 0; i--) {
            format = "%"+(i)+"c %"+(11-i)+".0f "+"%"+(11-i)+"c"+"%n";
            System.out.printf(format, letter, number, letter);
        }

    }
}
/* Output:
*A          1          A
 A         1         A
  A        1        A
   A       1       A
    A      1      A
     A     1     A
      A    1    A
       A   1   A
        A  1  A
         A 1 A
        A  1  A
       A   1   A
      A    1    A
     A     1     A
    A      1      A
   A       1       A
  A        1        A
 A         1         A
A          1          A
*/
