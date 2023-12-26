package _03_day;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 배열의 크기는 신경쓰지 X
        String[] nameList = new String[100];
        int[] ageList = new int[100];

        // 현재 고객수가 몇명이 저장되어있는지 알기 위한 변수.
        int count = 0; // 인덱스 번호임

        ESC:while (true) {

            //메뉴
            System.out.println("[Info]-고객수" + count);
            System.out.println("[메뉴] 1.추가, 2.전체보기, 3.정보검색, 4.정보수정, 5.정보삭제, 6.나가기");
            String menu = sc.next();

            switch (menu) {

                case "1":
                    System.out.println("=======고객 정보 입력=======");
                    /*
                     *  1. 이름과, 나이를 입력받고, 배열에 순서대로 값을 저장합니다.
                     *  2. count값을 증가
                     *
                     */
                    System.out.print("이름을 입력해주세요 : ");
                    nameList[count] = sc.next();
                    System.out.print("나이를 입력해주세요 : ");
                    ageList[count] = sc.nextInt();
                    count++;

                    System.out.println("==========================");
                    break;
                case "2":
                    System.out.println("======전체 고객정보 출력==== ");
                    /*  1. 배열에 저장된 고객정보 name~님의 나이는 age 입니다. 전부출력
                     */

                    // 인덱스 번호까지 반복문을 돌려서 출력해줌
                    for (int i = 0; i < count; i++) {
                        System.out.println(nameList[i] + " 님의 나이는 " + ageList[i] + " 입니다.");
                    }

                    System.out.println("==========================");
                    break;
                case "3":
                    System.out.println("=======고객 정보 검색=======");
                    /*
                        1. 이름을 입력받아서.
                        2. 배열에서 이름을 찾은 후에, "name님은 x번째에 있습니다"
                        3.                        "name~님의 나이는 age입니다"
                        4. 혹시 찾는 이름이 없다면, "name님의 정보는 없는데요?"

                     */
                    System.out.println("검색하실 이름을 입력하세요.");
                    String name = sc.next();

                    boolean bool = true;
                    for (int i = 0; i < count; i++) {
                        if (nameList[i].equals(name)) {
                            System.out.println(name + " 님의 " + (i + 1) + " 번 째에 있습니다.");
                            System.out.println(name + " 님의 나이는 " + ageList[i]);
                            bool = false;
                        }
                    }
                    if (bool) System.out.println(name + " 님의 정보는 없는데요?");

                    System.out.println("==========================");
                    break;
                case "4":
                    System.out.println("=======고객 정보 수정=======");
                    /*
                        1. 먼저 모든 name을 출력해서 볼 수 있게 처리
                        2. 이름 입력을 받습니다.
                        3. 해당 이름을 배열에서 찾은 후에, name, age를 다시 입력받습니다.
                        4. 해당 name, age 의 위치를 수정해주면 됩니다.
                        5. 잘못 입력된 경우는 "name님은 없습니다" 로 출력.
                     */

                    for (int i = 0; i < count; i++) {
                        System.out.print(nameList[i] + "  ");
                    }
                    System.out.println();
                    System.out.print("수정하실 이름을 입력해주세요 : ");
                    String name2 = sc.next();

                    boolean bool2 = true;

                    for (int i = 0; i < count; i++) {
                        if (nameList[i].equals(name2)) {
                            System.out.print("변경하실 이름을 입력해주세요 : ");
                            nameList[i] = sc.next();
                            System.out.print("변경하실 이름의 나이를 입력해주세요 : ");
                            ageList[i] = sc.nextInt();
                            bool2 = false;
                            // break 가 있었으면 좋겠다고 했는데 why ??
                        }
                    }
                    if (bool2) System.out.println(name2 + " 님은 없습니다.");
                    System.out.println("==========================");
                    break;
                case "5":
                    System.out.println("=======고객 정보 삭제=======");
                    /*
                    1. 먼저 모든 name을 출력해서 볼 수 있게 처리
                    2. 삭제할 이름을 입력 받습니다.
                    3. 이름이 어느위치에 있는지 찾고, 찾은 위치에서부터 count 미만 값을 하나씩 당겨오면 됨.
                    4. count 위치는 null, 0 초기화 하고 count--
                    */

                    for (int i = 0; i < count; i++) {
                        System.out.print(nameList[i] + "  ");
                    }
                    System.out.println();
                    System.out.print("삭제하실 고객의 이름을 입력해주세요 : ");
                    String name3 = sc.next();
                    boolean bool3 = true;

                    for (int i = 0; i < count; i++) {
                        if (name3.equals(nameList[i])) {
                            for (int j = i; j < count - 1; j++) {
                                nameList[j] = nameList[j+1];
                                ageList[j] = ageList[j+1];
                                // 아래 두가지 코드는 for 문 밖에서 실행하는 것이 좋다.
                                // 아래 두가지는 count-1 째로 수정해야 한다.
                                // 단 나처럼 count--; 를 선행 한다면 count -1 을 안해도 됨.
                            }
                            bool3 = false;
                            count--;
                        }
                    }

                    ageList[count] = 0;
                    nameList[count] = "으아악";

                    System.out.println(Arrays.toString(nameList));
                    if (bool3) System.out.println("잘못된 값을 입력 하셨습니다.");



                    System.out.println("==========================");
                    break;
                case "6":
                    System.out.println("=============================");
                    System.out.println("=========프로그램 종료==========");
                    System.out.println("=============================");
                    break ESC;
                    // while 탈출 하면 됩니다.
                default:
                    System.out.println("=============================");
                    System.out.println("=======메뉴는 숫자로 입력=======");
                    System.out.println("=============================");
                    break;
            }

        }

    }
}
