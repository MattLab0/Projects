public class Upper1stLetterMain {
    //String completeString2 = "ciao sono una frase fuori dal main";

    // String[] myArgs = completeString2.split("\\s");
    //args[0]="prova";

    public static void main(String[] myArgs) {
        for (String s : myArgs ) {
            System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
        }
    }
}
