package samples;

public class sampleJ {

   public String reverseStringSplit(String myString){
       String rString ="";

       if(myString.length() == 0){
           return "string is null, nothing to reverse";
       }else{
            String[] newString = myString.split("");
            for(int i = 1; i < newString.length+1; i++){
                String buildString = newString[newString.length -i];
                rString = rString+buildString;
            }
            myString = rString;
       }

       return myString;
    }


    public String reverseStringRec(String myString){
        String rString ="";
        if(myString.length() == 0){
            return "string is null, nothing to reverse";
        }else{
           return myString.substring(1)+myString.charAt(0);
        }
    }
}
