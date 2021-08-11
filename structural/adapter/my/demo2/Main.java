package structural.adapter.my.demo2;

import java.util.Arrays;
import java.util.List;

// 将 String[] 转换为 List<String>

public class Main {
    public static void main(String[] args) {
        // 1. service obj
        String[] strs = { "aaa", "bbb", "ccc" };
        // 2. adapter obj 包装 service obj
        List<String> ls = Arrays.asList(strs);
        // 3. 使用 adapter 将 String[] 转换为 List<String>
        System.out.println(ls.toString());
    }
}
