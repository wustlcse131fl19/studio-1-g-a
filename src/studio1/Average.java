package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap=new ArgsProcessor(args);
        int n1= ap.nextInt("Input the first integer.");
        int n2=ap.nextInt("Input the second integer.");
        double average=(n1+n2)/2;
        System.out.println("Average of "+n1+" and "+n2+" is "+average);
    }
}

/**creative exercise answers
 1. integer
 2. boolean
 3. integer
 4. double
 5. character
 6. character
 7. double
 8. double
 */