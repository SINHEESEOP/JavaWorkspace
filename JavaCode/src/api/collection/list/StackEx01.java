package api.collection.list;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackEx01 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
//        Vector<String> stack = new Stack<>();
//        List<String> stack = new Stack<>();

        stack.push("홍길동");
        stack.push("이순신");
        stack.push("홍길동");
        stack.push("홍길자");

//        먼저 들어간건? 배열의 첫번째, 마지막에 들어간건? 배열의 마지막, 그렇다면 여기서 값 추출시 가장 먼저 나올 건?;
//        배열의 마지막 값이 먼저 나온다는 소리다
//        컬렉션의 값을 문자열 형태로 출력
        System.out.println(stack.toString());

//        컬렉션의 사이즈 기능
        System.out.println(stack.size());

//        컬렉션이 비었는지 확인하는 기능
        System.out.println(stack.isEmpty());
        System.out.println("-----------------------------");
//        삭제와 동시에 값이 나옴
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        stack.pop(); 없으니 에러발생
//        ---------------------------
//        빈 배열을 출력
        System.out.println(stack.toString());
    }

}
