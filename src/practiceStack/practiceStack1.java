package practiceStack;

// 转十六进制

import java.util.*;

public class practiceStack1 {
    public static void main(String[] args) {
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }

    static String toHex(int n) {
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 0;
        while (n != 0) {
            num = n % 16;
            n = (n - num) / 16;
            stack.push(num);
        }
        System.out.println(stack);
        var result = new StringBuilder();
        while (!stack.isEmpty()){
            char chr = changeNum(stack.pop());
            result.append(chr);
        }
        System.out.println(result.toString());
        return result.toString();
    }

    static char changeNum(int num) {
        if(num<10) {
            return (char)('0'+num);
        } else {
            return (char)('A'+num-10);
        }
    }
}
