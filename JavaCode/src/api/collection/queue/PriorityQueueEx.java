package api.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        // 우선 순위큐
        PriorityQueue<Integer> que = new PriorityQueue<>();

        que.offer(3);
        que.offer(4);
        que.offer(3);
        que.offer(3
        );
        que.offer(2);
        que.offer(1);

//        뭐냐이건?
        System.out.println(que.toString());

//        데이터 꺼내기
//        프리올리티 큐는 자동 정렬기능이 있어, 1순위 정렬, 같은 수가 있다면 먼저 들어간 수가 나온다

        System.out.println( que.poll() );
        System.out.println( que.poll() );
        System.out.println( que.poll() );
        System.out.println( que.poll() );
        System.out.println( que.poll() );

//        객체를 넣어보자
//        객체를 Queue 에 넣을 때는 우선순위를 지정하는 방법이 정의되어야 합니다.

        PriorityQueue<Person> q = new PriorityQueue<>();

        q.offer( new Person("홍길동",20) );
        q.offer( new Person("홍길자",30) );
        q.offer( new Person("이순신",40) );
        q.offer( new Person("피카츄",50) );

//        a > 0 뒤에가 우선순위, a < 0 앞에가 우선순위, a == 0 같음
//        System.out.println("홍길동".compareTo("홍길자"));

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());

    }
}
