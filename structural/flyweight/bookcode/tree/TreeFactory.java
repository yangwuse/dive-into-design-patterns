package structural.flyweight.bookcode.tree;

import java.util.HashMap;
import java.util.Map;
import java.awt.*;

// 工厂类
// 管理缓存池

public class TreeFactory {
    static Map<String, TreeType> treeType = new HashMap<>();
    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        // 先查缓存池
        TreeType result = treeType.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeType.put(name, result);
        }
        return result;
    }
}
