import stringManipulation.sampleString;

public class App {
    public static void main(String[] args) {
        sampleString sampleJ = new sampleString();

        String mySplitString = sampleJ.reverseStringSplit("Me");
        System.out.println(mySplitString);

        String myRecString = sampleJ.reverseStringSplit("Silly");
        System.out.println(myRecString);

        String stringDoesNotContainsVowels = sampleJ.stringContainsVowels("PPP");
        System.out.println("This string does not contain vowels " + stringDoesNotContainsVowels);

        String stringContainsVowels = sampleJ.stringContainsVowels("Sunday");
        System.out.println("This string does contain vowels " + stringContainsVowels);


    }
}
