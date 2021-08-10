import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    public void should_judge_vowels_counts(){
        String str = "ajjjjj";

        Mommifier mommifier = new Mommifier();

        int vowelsSize = mommifier.countVowels(str);

        assertEquals(1, vowelsSize);
    }


}
