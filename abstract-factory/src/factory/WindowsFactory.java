package factory;

import bean.base.InterfaceController;
import bean.base.OperationController;
import bean.windows.WindowsInterfaceController;
import bean.windows.WindowsOperationController;
import factory.base.BaseAbstractFactory;

/**
 * @author nuonuo
 * @create 2021-10-08 21:49
 */
public class WindowsFactory implements BaseAbstractFactory {
    @Override
    public InterfaceController createInterfaceController() {
        return new WindowsInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new WindowsOperationController();
    }
}
