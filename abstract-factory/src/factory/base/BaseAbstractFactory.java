package factory.base;

import bean.base.InterfaceController;
import bean.base.OperationController;

/**
 * 抽象工厂
 * @author nuonuo
 * @create 2021-10-08 21:39
 */
public interface BaseAbstractFactory {
    public InterfaceController createInterfaceController();

    public OperationController createOperationController();
}
