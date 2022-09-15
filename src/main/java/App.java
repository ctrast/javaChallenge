import numbers.sampleNumbers;
import stringManipulation.sampleString;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        sampleString sampleS = new sampleString();
        sampleNumbers sampleN = new sampleNumbers();

        String mySplitString = sampleS.reverseStringSplit("Me");
        System.out.println(mySplitString);

        String myRecString = sampleS.reverseStringSplit("Silly");
        System.out.println(myRecString);

        String stringDoesNotContainsVowels = sampleS.stringContainsVowels("PPP");
        System.out.println("This string does not contain vowels " + stringDoesNotContainsVowels);

        String stringContainsVowels = sampleS.stringContainsVowels("Sunday");
        System.out.println("This string does contain vowels " + stringContainsVowels);

        Boolean isEven = sampleN.isEven(7);
        System.out.println("The number is even? " + isEven);

        int[] nums = {3, 2, 3, 4, 5};
        int number = 8;
        Map<String, Integer> addUp = sampleN.doesNumberAddup(nums, number);
        boolean equals;
        if (addUp.get("Equal") == 1) {
            equals = true;
        } else {
            equals = false;
        }
        System.out.println("Numbers " + addUp.get("First") + " and " + addUp.get("Second") + " equal?" +equals );
    }
}
