package demo;

import bean.base.InterfaceController;
import bean.base.OperationController;
import factory.base.BaseAbstractFactory;
import utils.XMLUtil;

/**
 * @author nuonuo
 * @create 2021-10-08 21:50
 */
public class AbstractFactoryDemo1 {
    public static void main(String[] args) {
        BaseAbstractFactory factory = (BaseAbstractFactory) XMLUtil.getBean();
        assert factory != null;
        InterfaceController interfaceController = factory.createInterfaceController();
        OperationController operationController = factory.createOperationController();
        interfaceController.start();
        operationController.move();
    }
}
