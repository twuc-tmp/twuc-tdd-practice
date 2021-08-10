import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yang.bian
 * @create 2021/8/10 11:07
 */
public class Mommifier {

    private List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public int countVowels(String vowelsStr) {
        int count=0;
        for (int i = 0; i < vowelsStr.length(); i++) {
            if (vowels.contains(vowelsStr.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
