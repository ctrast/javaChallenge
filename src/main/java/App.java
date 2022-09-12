import samples.sampleJ;

public class App {
    public static void main(String[] args) {

        sampleJ sampleJ = new sampleJ();
        String mySplitString = sampleJ.reverseStringSplit("Me");
        System.out.println(mySplitString);


        String myRecString = sampleJ.reverseStringSplit("Silly");
        System.out.println(myRecString);
    }


}
