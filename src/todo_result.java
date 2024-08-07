import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class todo_result {
    Map<String, List<Integer>> result_map;

    public todo_result(Map<String, List<Integer>> result_map) {
        this.result_map = result_map;
    }
//      생성자
    public void todo_result_main() {
        System.out.println("참여자별 ToDo list 진행 현황");
        for (String s : result_map.keySet()) {
            System.out.println("- 참여자 : " + s);
            setAnswer(result_map.get(s));
        }
    }

    private void setAnswer(List<Integer> integers) {
//        integers 구조 ex) [0,0,1,0,0]

        List<String> ans_list = Arrays.asList("1. 주간 보고서 작성", "2. 이메일 확인 및 응답", "3. 회의 준비" +
                "4. 프로젝트 계획서 수정", "5.팀 멤버와의 1:1 면담");
        for (int i = 0; i < 5; i++) {
            System.out.print(ans_list.get(i));
            if (integers.get(i) == 1) System.out.println("(완료)");
            else System.out.println("(미정)");
//            '1'인 번호만 (완료) 나오게
        }
    }
}
