
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class WordQuestionGenerator {

    public static List<wordModel> generateSoal() {
        List<wordModel> listSoal = new ArrayList<>();
        try {
            Scanner scan;
            scan = new Scanner(new File("C:/gameAcakKata.txt"));

            while (scan.hasNextLine()) {
                String next = scan.nextLine();
                String[] data = next.split(",");

                String basicWord = data[0];
                String hint = data[1].trim();

                wordModel wM = new wordModel(basicWord, hint);
                listSoal.add(wM);
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return listSoal;
    }
}
