package lab.oodp.moreclass.pattern;

public class PrintPatternProgram {

    public void start() {
        
        printPatternOne();
        printPatternTwo();
        
    }
    public void printPatternOne() {
        System.out.println("Pattern One:");
        //TODO: uncomment the lines below
        Pattern pattern1 = new Pattern(5, '*');
        Pattern pattern2 = new Pattern(5, '@');
        Pattern pattern3 = new Pattern(5, '#');

        System.out.println(pattern1.toString());
        System.out.println(pattern2.toString());
        System.out.println(pattern3.toString());
    }
    
    public void printPatternTwo() {
        System.out.println("Pattern two");
        
        //TODO: Complete this method

         for (int i = 1; i <= 5; i++) {
            Pattern pattern = new Pattern(i, '*');
            System.out.println(pattern.toString());
        }


    }

    public static void main(String[] args) {
        PrintPatternProgram ppp = new PrintPatternProgram();
        ppp.start();
    }
}
