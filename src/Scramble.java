import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SARMASAGI GYORK on 15. 05. 11..
 * Company: BME
 * Github: faklyasgyuri
 */
public class Scramble {

    public void startRead() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = in.readLine()) != null && s.length() != 0 && !s.equals("0")) {
            //System.out.println(s);
            String[] splitString = s.split("\\s+");
            for(String result: splitString)
            {
                System.out.println(scramble(result));
            }

        }
    }

    //This function split the given sentence into parts by spaces
    public String mySplit(String sentence){

        String result = "";
        String[] splitted = sentence.split("\\s+");
        for (int i = 0; i<splitted.length; i++){
            //if next word is not the last world than we add a space character after it
            if(i<splitted.length-1){
                //we call scramble function for every word
                result += scramble(splitted[i])+" ";
            }
            //if it is the last world we don't add plus space character
            else {
                result += scramble(splitted[i]);
            }
        }
        return result;
    }

    //scramble function
    public String scramble(String word){

        if(word.length()>1){
            String firstLetter = String.valueOf(word.charAt(0));
            String middleOfWord = word.substring(1, word.length()-1);
            String reverse = "";

            int length = middleOfWord.length();
            for ( int i = length - 1 ; i >= 0 ; i-- )
                reverse = reverse + middleOfWord.charAt(i);

            String lastLetter = String.valueOf(word.charAt(word.length()-1));

            return firstLetter+reverse+lastLetter;
        }
        else return word;
    }
}
