public class BasicJava {
    //Two ways to print output
    public static void main(String[] args){
//        Method 1: Print Line "println"
        System.out.println("Hello World");
//        Method 2: Print Method "print"
        System.out.print("Hasnat ");
        System.out.print("Shahriyar");
//        Escape Sequence: It is a special Character followed by backslash "\"
        /*
         * \b backspace
         * \t tab
         * \n new line
         * \r carriage return
         * \" double quote
         * \' single quote
         * \\ backslash
         */
//        new line with \n
        System.out.print("\nName: Hasnat,\nAge: 24,\nEducation: Bachelors in CSE\n");
//        tab with \t
        System.out.println("Tab: \t" + 1);
//        double quote with \"
        System.out.println(" \"Printing Double Quote\" ");
//        single quote with \'
        System.out.println(" 'Printing Single Quote' ");
    }
}
