package design.patterns.builder;


/**
 * 建造者模式（builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 一个 builder 类会一步一步构造最终的对象。该 builder 类是独立于其他对象的。
 *
 * 意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 *
 * 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，
 * 这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 *
 * 何时使用：一些基本部件不会变，而其组合经常变化的时候。
 *
 * 如何解决：将变与不变分离开。
 *
 * 关键代码：建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。
 */

public class BuilderDemo {

    public static void main(String[] args) {
        Meal m1 = new Meal();
        m1.addItem(new VegBurger());
        m1.addItem(new Coke());
        m1.showItems();
        System.out.println("Cost : " + m1.getCost());

        System.out.println("========================");

        Meal m2 = new Meal();
        m2.addItem(new ChickenBurger());
        m2.addItem(new Pepsi());
        m2.showItems();
        System.out.println("Cost : " + m2.getCost());

        System.out.println("========================");

        Meal m3 = new Meal();
        m3.addItem(new Coke());
        m3.showItems();
        System.out.println("Cost : " + m3.getCost());
    }
}
