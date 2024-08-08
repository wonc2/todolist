import java.util.*;

public class TodoManager {


    // 리턴 - 입력받은 (이름 - key), (작업 완료 상태 - value) 가지는 맵
    public Map<String, List<Integer>> getUserResult() {

        Map<String, List<Integer>> userAnswerMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Status 기호 : 완료, 미정 -> 번호 선택 시 자동 부여\n" +
                "진행 기호 : c - 계속 입력, q - 다음 참여자로 넘기기, x - 모든 입력 종료\n");

        while (true) {
            // 각 작업의 완료 상태를 저장하는 배열 초기화 (0: 미완료, 1: 완료)
            Integer[] completionStatus = {0, 0, 0, 0, 0};
            System.out.print("Input Your Name : ");
            String userName = sc.nextLine();

            while (true) {
                // 사용자가 선택한 작업 번호 값을 가져옴 (1~5)
                String answer = getUserTaskSelection(sc);

                // 사용자가 종료 여부에서 입력한 값 가져옴 (c,q,x)
                String exit = getExitStatus(sc);

                // 선택한 작업을 완료 상태로 표시 (위에서 초기화한 배열 인덱스 1로 바꿈)
                completionStatus[Integer.parseInt(answer) - 1] = 1;

                // 종료 조건 확인: 'q', 'x'
                if (exit.equals("q") || exit.equals("x")) {
                    userAnswerMap.put(userName, Arrays.asList(completionStatus));

                    // 'x'를 입력하면 모든 입력 종료 및 지금까지 만든 맵 리턴
                    if (exit.equals("x")) return userAnswerMap;

                    // 'q'를 입력하면 다음 사용자로 넘어감
                    break;
                }
            }
        }
    }

    public String getUserTaskSelection(Scanner sc) {
        // 선택지 출력하고 선택할 번호 입력

        System.out.println("ToDo List 중 하나 선택 하세요 !\n" +
                "1. 주간 보고서 작성, 2. 이메일 확인 및 응답, 3. 회의 준비, 4. 프로젝트 계획서 수정, 5. 팀 멤버와의 1:1 면담");

        while (true) {
            System.out.print("Title 번호 : ");
            String answer = sc.nextLine();
            // 1부터 5까지의 숫자를 입력받아 검증
            if (answer.matches("[1-5]")) {
                System.out.println("Status: 완료");
                return answer;
            }
        }
    }

    public String getExitStatus(Scanner sc) {
        // 입력을 계속할지 종료할지 선택 - (c: 계속, q: 다음 사용자로, x: 모든 입력 종료)
        while (true) {
            System.out.print("종료 여부 : ");
            String exit = sc.nextLine();
            // 'c', 'q', 'x' 중 하나를 입력받아 검증
            if (exit.matches("[cqx]")) {
                System.out.println("\n--------------");
                return exit;
            }
        }
    }
}