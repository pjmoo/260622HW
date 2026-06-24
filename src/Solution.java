import java.util.*;

public class Solution {
    public boolean solution(String s) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] arr = s.split("");
        for (String v : arr) {

            if (v.equals("(")) {

                stack.push(1);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }


                stack.peek();
                stack.pop();
            }
        }


        boolean answer = (stack.size() == 0);
        return answer;
    }
}