package structural.flyweight.bookcode;

import structural.flyweight.bookcode.forest.Forest;

// 画森林
// 森林 -> 种树 -> 工厂方法 -> 缓存对象(负责画)

public class Mian {
    static int CANVAS_SIZE = 500;
    static int TREES = 1000_000;
    static int TREE_TYPES = 2;
    public static void main(String[] args) {
        // 1. 森林
        Forest forest = new Forest();
        // 2. 树
        // for (int i = 0; i < TREES / TREE_TYPES; i++) {
        //     forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
        //     "Summer Oak", Color.green, "Oak texture stub");
        //     forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), 
        //     "Autumn Oak", Color.yellow, "Autumn Oak texture stub");
        // }
        // forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        // forest.setVisible(true);
        // System.out.println(TREES + " trees drawn");
        // System.out.println("---------------------");
        // System.out.println("Memory usage:");
        // System.out.println("Tree size (8 bytes) * " + TREES);
        // System.out.println("+ TreeType size * " + TREE_TYPES);
        // System.out.println("---------------------");
        // System.out.println("Total: " + ((TREES * 8 + TREE_TYPES * 30) / 1024 / 1024) +
        //     "MB instead of " + ((TREES * 38) / 1024 / 1024) + "MB");
        
    }

    private static int random(int min, int max) {
        return min + (int) Math.random() * (max - min + 1);
    }
}
