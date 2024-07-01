package afternoon.lang.math.ex;

import java.util.Random;

public class LottoGenerator {
    Random random = new Random();
    int lottoNumbers;

    public void generate(){
        lottoNumbers = random.nextInt(45);
    }
    public void printLottoNumbers() {
        System.out.println(lottoNumbers);
    }


}

package afternoon.lang.math.ex;

import java.util.Random;

public class LottoGenerator {
    Random random = new Random();
    int[] lottoNumbers = new int[6];

    public void generate() {
        int count = 0;
        while (count < 6) {
            int number = random.nextInt(45) + 1;
            if (!isDuplicate(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
    }

    private boolean isDuplicate(int number) {
        for (int i = 0; i < lottoNumbers.length; i++) {
            if (lottoNumbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    public void printLottoNumbers() {
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(lottoNumbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LottoGenerator lotto = new LottoGenerator();
        lotto.generate();
        lotto.printLottoNumbers();
    }
}
