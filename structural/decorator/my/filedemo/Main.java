package structural.decorator.my.filedemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

// 装饰器 = 附加功能 = 非核心功能 = 包装器
// 给 FileInputStream 增加缓冲和解压缩功能
// 将核心功能和附加功能区分开

public class Main {
    public static void main(String[] args) throws Exception {
        // 原始对象
        InputStream is = new FileInputStream("path");
        // 包装(附加)缓冲功能
        InputStream bis = new BufferedInputStream(is);
        // 包装(附加)解压缩功能
        InputStream gis = new GZIPInputStream(bis);

        // 等价于
        InputStream is2 = new GZIPInputStream(  // 第二层包装
                            new BufferedInputStream( // 第一层包装
                                new FileInputStream("path")));  // 核心功能 
    }
}
