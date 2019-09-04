
// a) Creates error when compiling as it should match the file name
// b) No error occurs, as it is just the text that is being printed, only difference is in the text which is printed
// c) Compiling error because it thinks that there should be a second quotation, to close out the untouched quotation mark
// d) Same error as before, except this time, the program has no end to what is being printed
// e) Error when running, program can't find the "main method"
// f) Error when compiling, "bogus" is an unknow varible 
// g) Error when compiling, it expected a semicolon
// h) Error when compiling, did not know when the program ended and could not finish compiling
public class Test
{
    public static void main (String[] args)
    {
        System.out.println ("An Emergency Broadcast");
    }

}
