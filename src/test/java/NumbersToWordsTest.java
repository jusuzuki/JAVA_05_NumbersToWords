import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

<<<<<<< HEAD

    @Test
    public void test_for_3(){
        NumbersToWords app = new NumbersToWords();
        String word = "three";
        assertEquals(word, app.finalWord(3));
    }

    @Test
    public void test_for_13(){
        NumbersToWords app = new NumbersToWords();
        String word = "thirteen";
        assertEquals(word, app.finalWord(13));
    }

    @Test
    public void test_for_10(){
        NumbersToWords app = new NumbersToWords();
        String word = "ten";
        assertEquals(word, app.finalWord(10));
    }

    @Test
    public void test_for_27(){
        NumbersToWords app = new NumbersToWords();
        String word = "twenty-seven";
        assertEquals(word, app.finalWord(27));
    }

    @Test
    public void test_for_200(){
        NumbersToWords app = new NumbersToWords();
        String word = "two hundred";
        assertEquals(word, app.finalWord(200));
    }

    @Test
    public void test_for_130(){
        NumbersToWords app = new NumbersToWords();
        String word = "one hundred thirty";
        assertEquals(word, app.finalWord(130));
    }

    @Test
    public void test_for_456(){
        NumbersToWords app = new NumbersToWords();
        String word = "four hundred fifty-six";
        assertEquals(word, app.finalWord(456));
    }


=======
    @Test
    public void test_forthree_3(){
        NumbersToWords app = new NumbersToWords();
        String word = "three";
        assertEquals(word, app.finalWord("3"));
    }
>>>>>>> f8994cd808cf4d3f893434ab2134b307e5b83b71
}
