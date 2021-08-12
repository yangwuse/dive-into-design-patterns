package structural.composition.my.totalpricedemo;

public class Main {
    public static void main(String[] args) {
        Bugs bigBug = new Bugs("大袋子", 10);
        Goods g1 = new Goods("康师傅泡面", 5, 2);
        Goods g2 = new Goods("火腿肠", 2, 3);
        Bugs smallBug = new Bugs("小袋子", 3);

        bigBug.add(g1);
        bigBug.add(g2);
        bigBug.add(smallBug);

        Goods g3 = new Goods("牙刷", 30, 1);
        Goods g4 = new Goods("纸巾", 15, 2);

        smallBug.add(g3);
        smallBug.add(g4);

        bigBug.show();
        System.out.println("总价: " + bigBug.getPrice());
    }
}
