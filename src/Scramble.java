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
        while ((s = in.readLine()) != null && s.length() != 0) {
            //System.out.println(s);
            String result = scramble(s);
            System.out.println(result);
        }
    }

    public String scramble(String word){
        String firstLetter = String.valueOf(word.charAt(0));
        String middleOfWord = word.substring(1, word.length()-1);
        String reverse = "";

        int length = middleOfWord.length();
        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + middleOfWord.charAt(i);

        String lastLetter = String.valueOf(word.charAt(word.length()-1));

        return firstLetter+reverse+lastLetter;
    }
}
