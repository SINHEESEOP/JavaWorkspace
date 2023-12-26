package chap_07;

public class _01_Class {

    public static void main(String[] args) {

//
//        String modelName = "까망이";
//        String resoult = "FHD";
//        int price = 20000;
//        String color = "블랙";

        // 생각해보니 선 객체 후 클래스도 가능하긴 하다..
        // 사람도 객체이지만 만들어지는 과정은 뒤늦게 밝혀졌고 진행중이니까..
        // 근데 사실 사람 객체의 클래스는 이미 있었고 우리가 뒤늦게 발견하는 걸지도?
        // 아 그럼 사람은 객체이면서 동시에 클래스네.. 공존 가능한 거였어

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.color = "블랙";
        b1.price = 200000;
        b1.resolution = "UHD";


    }
}
