import java.util.*;

public class ToDoList {

    public Map<String, List<Integer>> resultMap() {
        Map<String, List<Integer>> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Status 기호 : 완료, 미정 -> 번호 선택 시 자동 부여\n" +
                "진행 기호 : c - 계속 입력, q - 다음 참여자로 넘기기, x - 모든 입력 종료\n");

        List<Integer> list = new ArrayList<>();
        while (true) {
            String userName = sc.nextLine();
            String exit = "";

            while (true) {
                System.out.println("ToDo List 중 하나 선택 하세요 !\n" +
                        "1. 주간 보고서 작성, 2. 이메일 확인 및 응답, 3. 회의 준비, 4. 프로젝트 계획서 수정, 5.팀 멤버와의 1:1 면담\n");
                System.out.print("Title 번호 : ");
                list.add(sc.nextInt());
                System.out.println("Status: 완료");
                System.out.println("종료 여부 :");

                exit = sc.nextLine();
                if (exit.equals("q")) break;
                else if (exit.equals("x")) break;
            }
            map.put(userName, list);
            if (exit.equals("x")) break;
        }

        return map;
    }
}
