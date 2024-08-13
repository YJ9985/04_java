package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }


    public void increment() {
        if (count < max) {
            count++;
        } else {
            System.out.println("최댓값 " + max + " 이상 숫자를 증가할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }
}
