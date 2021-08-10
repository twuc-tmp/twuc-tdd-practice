import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {

    @Test
    public void should_judge_vowels_counts(){
        String str = "ajjjjj";

        Mommifier mommifier = new Mommifier();

        int vowelsSize = mommifier.countVowels(str);

        Assertions.assertEquals(1, vowelsSize);
    }


}
