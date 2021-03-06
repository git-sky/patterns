package cn.com.sky.patterns.creational.builder.model;

/**
 * <pre>
 *
 * Builder 建造者模式
 *
 * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 *
 * 建造者模式：是将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 * 　建造模式是对象的创建模式。建造模式可以将一个产品的内部表象（internal representation）与产品的生产过程分割开来，从而可以使一个建造过程生成具有不同的内部表象的产品对象。
 *
 *
 * 建造模式都存在这么两个部分，一个部分是部件构造和产品装配，另一个部分是整体构建的算法。认识这点是很重要的，因为在建造模式中，强调的是固定整体构建的算法，
 * 而灵活扩展和切换部件的具体构造和产品装配的方式。
 * 建造模式的重心在于分离构建算法和具体的构造实现，从而使得构建算法可以重用。具体的构造实现可以很方便地扩展和切换，从而可以灵活地组合来构造出不同的产品对象。
 *
 *
 * 建造者模式通常包括下面几个角色：
 *
 * 1. builder：给出一个抽象接口，以规范产品对象的各个组成成分的建造。这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建。
 *
 * 2. ConcreteBuilder：实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例。
 *
 * 3. Director：调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。
 *
 * 4. Product：要创建的复杂对象。
 *
 *
 * 使用建造者模式的好处：
 *
 * 1.使用建造者模式可以使客户端不必知道产品内部组成的细节。
 *
 * 2.具体的建造者类之间是相互独立的，对系统的扩展非常有利。
 *
 * 3.由于具体的建造者是独立的，因此可以对建造过程逐步细化，而不对其他的模块产生任何影响。
 *
 * 使用建造模式的场合：
 *
 * 1.创建一些复杂的对象时，这些对象的内部组成构件间的建造顺序是稳定的，但是对象的内部组成构件面临着复杂的变化。
 *
 * 2.要创建的复杂对象的算法，独立于该对象的组成部分，也独立于组成部分的装配方法时。
 *
 *
 * 在Java的应用中JavaMail使用到了该模式。
 *
 * </pre>
 */
public class Client {

    public static void main(String[] args) {

        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();

        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
        System.out.println(product);
    }
}