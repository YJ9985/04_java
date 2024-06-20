package afternoon;

public class Speaker {
    private int volume;

    public Speaker() {
        this.volume = 20;
    }

    public void volumeUp() {
        if (volumeMax()) {
            this.volume += 1;
            //this.volume++;
        } else {
            unfeasible();
        }
    }

    public void volumeDown() {
        if (volumeMin()) {
            this.volume -= 1;
        } else {
            unfeasible();
        }
    }

    public void getVolume() {
        System.out.println("Volume: " + this.volume);
    }

    public void volumeMute() {
        this.volume = 0;
        System.out.println("스피커가 Mute 되었습니다.");
    }

    private boolean volumeMax() {
        return this.volume < 100;
    }

    private boolean volumeMin() {
        return this.volume > 0;
    }

    private void unfeasible() {
        System.out.println("더 이상 볼륨 조절이 불가능합니다.");
    }

}
