public class Main {
    public static void main(String[] args) {
        PDA pda = new PDA();
        String[] arrayOfCorrectInputStrings =
                {"a",
                "a+b",
                "c*a",
                "b+a*c",
                "(b+a)*c",
                "(a+c)*(a+b)",
                "a*(b+c)",
                "(b)+c*a"};
        String[] arrayOfIncorrectInputStrings =
                {"+a",
                "ab*c",
                "(ac)b*"};
        for(int i = 0; i < arrayOfCorrectInputStrings.length; i++){
            pda.analyseToTxt(arrayOfCorrectInputStrings[i]);
        }
        for(int j = 0; j < arrayOfIncorrectInputStrings.length;j++){
            pda.analyseToTxt(arrayOfIncorrectInputStrings[j]);
        }
    }
}

