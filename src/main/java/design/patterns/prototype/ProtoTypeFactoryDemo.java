package design.patterns.prototype;

/**
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * <p>
 * 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。
 * 例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。
 * <p>
 * 意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * <p>
 * 主要解决：在运行期建立和删除原型。
 * <p>
 * 何时使用： 1、当一个系统应该独立于它的产品创建，构成和表示时。
 *          2、当要实例化的类是在运行时刻指定时，例如，通过动态装载。
 *          3、为了避免创建一个与产品类层次平行的工厂类层次时。
 *          4、当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
 * <p>
 * 如何解决：利用已有的一个原型对象，快速地生成和原型对象一样的实例。
 * <p>
 * 关键代码： 1、实现克隆操作，在 JAVA 继承 Cloneable，重写 clone()，在 .NET 中可以使用 Object 类的 MemberwiseClone()
 * 方法来实现对象的浅拷贝或通过序列化的方式来实现深拷贝。 2、原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，
 * 它同样要求这些"易变类"拥有稳定的接口。
 * <p>
 * 应用实例： 1、细胞分裂。 2、JAVA 中的 Object clone() 方法。
 * <p>
 * 优点： 1、性能提高。 2、逃避构造函数的约束。
 * <p>
 * 缺点： 1、配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，
 * 特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。 2、必须实现 Cloneable 接口
 */
public class ProtoTypeFactoryDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape sc1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape:" + sc1.getId());
        System.out.println(sc1);
        sc1.draw();

        Shape sc11 = (Shape) ShapeCache.getShape("1");
        sc11.setId("11");
        System.out.println("Shape:" + sc11.getId());
        System.out.println(sc11);
        sc1.draw();

        Shape sc2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape:" + sc2.getId());
        System.out.println(sc2);
        sc2.draw();

        Shape sc3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape:" + sc3.getId());
        System.out.println(sc3);
        sc3.draw();
    }
}
