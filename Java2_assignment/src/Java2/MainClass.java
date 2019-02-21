package Java2;

// 9.  Design classes having attributes for furniture where there are wooden chairs and tables,
// metal chairs and tables.
// There are stress and fire tests for each products.
abstract class Furniture {
    String material;
    int weight;
    String color;

    public Furniture(String material, int weight, String color) {
        this.material = material;
        this.weight = weight;
        this.color = color;
    }

    abstract void stressTest(String material, int weight);

    abstract void fireTest(String material);

}

class Chair extends Furniture {
    String shape;

    Chair(String material, int weight, String color, String shape) {
        super(material, weight, color);
        this.shape = shape;
    }

    void stressTest(String material, int weight) {
        int stress = 10;

        if (material == "wooden") {
            if (weight < stress) {
                System.out.println("stress test of wooden chair failed");
            } else {
                System.out.println("stress test of wooden chair passed");
            }

        } else if (material == "metal") {
            System.out.println("stress test of metal passes");
        }

    }

    void fireTest(String material) {
        if (material == "wooden") {
            System.out.println("fire test of wooden chair fail");
        } else if (material == "metal") {
            System.out.println("fire test of metal chair passes");
        }

    }

}

class Table extends Furniture {
    String shape;
    int height;

    Table(String material, int weight, String color, String shape, int height) {
        super(material, weight, color);
        this.shape = shape;
        this.height = height;
    }

    void stressTest(String material, int weight) {
        int stress = 20;

        if (material == "wooden") {
            if (weight < stress) {
                System.out.println("stress test of wooden table failed");
            } else {
                System.out.println("stress test of wooden table passed");
            }

        } else if (material == "metal") {
            System.out.println("stress test of metal table passes");
        }

    }

    void fireTest(String material) {
        if (material == "wooden") {
            System.out.println("fire test of wooden chair fail");
        } else if (material == "metal") {
            System.out.println("fire test of metal passes");
        }

    }

}


public class MainClass {
    public static void main(String[] args) {

        Chair c1 = new Chair("wooden", 5, "red", "circular");
        Chair c2 = new Chair("metal", 7, "blue", "square");
        c1.stressTest(c1.material,c1.weight);
        c1.fireTest(c1.material);
        c2.stressTest(c2.material,c2.weight);
        c2.fireTest(c2.material);
        Table t1 = new Table("wooden", 7, "black", "round", 2);
        t1.stressTest(t1.material,t1.weight);
        t1.fireTest(t1.material);
        Table t2 = new Table("metal", 10, "blue", "rectangular", 3);
        t2.stressTest(t2.material,t2.weight);
        t2.fireTest(t2.material);

    }
}
