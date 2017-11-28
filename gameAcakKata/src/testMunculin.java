
import java.util.List;

public class testMunculin {
    public static void main(String[] args) {
        wordModel word;
        List<wordModel> lists = WordQuestionGenerator.generateSoal();
        int soalIndex = (int) Math.floor(Math.random() * lists.size());
        
        word = lists.get(soalIndex);
        System.out.println("Soal: "+ word.acakKata());
        
    }
    
}
