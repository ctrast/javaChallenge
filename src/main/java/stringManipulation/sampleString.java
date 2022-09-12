package stringManipulation;

public class sampleString {

    public String reverseStringSplit(String myString) {
        String rString = "";

        if (myString != null && !myString.trim().isEmpty()) {
            return "string is null, nothing to reverse";
        } else {
            String[] newString = myString.split("");
            for (int i = 1; i < newString.length + 1; i++) {
                String buildString = newString[newString.length - i];
                rString = rString + buildString;
            }
            myString = rString;
        }

        return myString;
    }


    public String reverseStringRec(String myString) {
        String rString = "";
        if (myString != null && !myString.trim().isEmpty()) {
            return "string is null, nothing to reverse";
        } else {
            return myString.substring(1) + myString.charAt(0);
        }
    }


    public String stringContainsVowels(String myString) {
        if (myString != null && !myString.trim().isEmpty()) {
            if (myString.toLowerCase().contains("a") ||
                    myString.toLowerCase().contains("e") ||
                    myString.toLowerCase().contains("i") ||
                    myString.toLowerCase().contains("o") ||
                    myString.toLowerCase().contains("u")) {
                return "String contains vowels";
            } else {
                return "String DOES NOT contains vowels";
            }

        }
        return myString;
    }
}
