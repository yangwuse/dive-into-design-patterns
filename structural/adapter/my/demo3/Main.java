package structural.adapter.my.demo3;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


// 将 InputStream 转换为 Reader

public class Main {
    static String path = "/Users/yangwu/vscode-workspace/java-projects/design-pattern/dive-into-design-patterns/README.md";
    public static void main(String[] args) throws IOException {
        // 1. 创建 service 对象
        InputStream in = Files.newInputStream(Paths.get(path));

        // 2. 创建 adapter 对象 转换类型
        Reader reader = new InputStreamReader(in);
        
        // 3. 用户使用 Reader 类型
        readText(reader);
    }  
    
    public static void readText(Reader reader) throws IOException {
        char[] buffer = new char[1024];
        int n = 0;
        while ((n = reader.read(buffer)) > 0 ) {
            System.out.print(new String(buffer, 0, n));
        }
    }
}
