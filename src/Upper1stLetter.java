import java.util.Locale;

public class Upper1stLetter {
    //String completeString2 = "ciao sono una frase fuori dal main";

    // String[] myArgs = completeString2.split("\\s");
    //args[0]="prova";

    public static void main(String[] myArgs) {
        String completeString = "ciao sono una frase";
        String[] pargs = completeString.split("\\s");
        for (String s : pargs ) {
            System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
        }
    }
}
