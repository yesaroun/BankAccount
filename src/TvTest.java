class Tv{
    // TV의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // TV의 기능(메서드)
    void power() { power = !power; }
    void channelUp(){ ++channel; }
    void channelDown(){ --channel; }
}

public class TvTest {
    public static void main(String[] args){
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.printf("t1의 channel은 %d입니다.\n", t1.channel);
        System.out.printf("t2의 channel은 %d입니다.\n", t2.channel);

        t2 = t1;
        t1.channel = 7;
        System.out.printf("t1의 channel을 %d로 변경하였습니다.\n", t1.channel);

        System.out.printf("t1의 channel은 %d입니다.\n", t1.channel);
        System.out.printf("t2의 channel은 %d입니다.\n", t2.channel);
    }
}
