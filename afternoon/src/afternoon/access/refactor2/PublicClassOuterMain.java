package afternoon.access.refactor2;

import afternoon.access.refactor.PublicClass;
//import afternoon.access.refactor2.DefaultClass1; //package 달라서 오류

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
//        DefaultClass1 dc1 = new DefaultClass1(); //default: package 달라서 못 불러옴
    }
}
