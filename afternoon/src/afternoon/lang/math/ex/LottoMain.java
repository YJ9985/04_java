package lang.math.lotto;

public class LottoMain {
    public static void main(String[] args) {
        lang.math.lotto.LottoGenerator lottoGenerator = new lang.math.lotto.LottoGenerator();

        lottoGenerator.generate();
        lottoGenerator.printLottoNumbers();
    }
}