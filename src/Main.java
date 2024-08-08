import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //        todo_result todoResult = new todo_result();
//        ----> 객체 생성 parameter type => Map<String,<List<Integer>>
//        map key: 사용자 이름, value: [1,1,0,0,0] 처럼 완료 한 것만 1 나오게
//        todoResult.todo_result_main();
//        ----> 반복문 실행 메소드

        TodoManager todoManager = new TodoManager();
        Map<String, List<Integer>> listMap = todoManager.getUserResult();
        todo_result todoResult = new todo_result(listMap);
        todoResult.todo_result_main();
    }
}