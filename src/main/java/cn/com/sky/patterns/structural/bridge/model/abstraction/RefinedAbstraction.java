package cn.com.sky.patterns.structural.bridge.model.abstraction;

public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        imp.operationImp();
    }

}
