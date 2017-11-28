
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class wordModel {

    private String basicWord;
    private String Soal;
    private String hint;
    private String Jawaban;
    private int life;
    
    public wordModel() {
    }

    public wordModel(String basicWord, String hint) {
        this.basicWord = basicWord;
        this.hint = hint;
    }

    @Override
    public String toString(){
        return (this.basicWord);
    }
    
    public String createSoal(){
        setBasicWord(getBasicWord().toUpperCase());
        String[] arrayOfWord = getBasicWord().split("");
        Arrays.sort(arrayOfWord);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayOfWord.length; i++) {
            sb.append(arrayOfWord[i]);
        }
        String soal = sb.toString();
        return soal;
    }
    
    
    public String acakKata(){
        setBasicWord(getBasicWord().toUpperCase());
        String[] arrayOfWord = getBasicWord().split("");
        List<String> hurufHuruf = Arrays.asList(arrayOfWord);
        Collections.shuffle(hurufHuruf);
        
        StringBuilder sb = new StringBuilder();
        for (String huruf : hurufHuruf) {
            sb.append(huruf);
        }
        return sb.toString();
    }
    
    public boolean cekJawaban(){
        boolean hasil = false;
        if(getJawaban().equalsIgnoreCase(basicWord)) {
            hasil = true;
    }
        return hasil;
    }

    /**
     * @return the basicWord
     */
    public String getBasicWord() {
        return basicWord;
    }

    /**
     * @param basicWord the basicWord to set
     */
    public void setBasicWord(String basicWord) {
        this.basicWord = basicWord;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * @return the Soal
     */
    public String getSoal() {
        return Soal;
    }

    /**
     * @param Soal the Soal to set
     */
    public void setSoal(String Soal) {
        this.Soal = Soal;
    }

    /**
     * @return the Jawaban
     */
    public String getJawaban() {
        return Jawaban;
    }

    /**
     * @param Jawaban the Jawaban to set
     */
    public void setJawaban(String Jawaban) {
        this.Jawaban = Jawaban;
    }

    /**
     * @return the life
     */
    public int getLife() {
        return life;
    }

    /**
     * @param life the life to set
     */
    public void setLife(int life) {
        this.life = life;
    }

    
}
