package factory;

import bean.android.AndroidInterfaceController;
import bean.android.AndroidOperationController;
import bean.base.InterfaceController;
import bean.base.OperationController;
import factory.base.BaseAbstractFactory;

/**
 * @author nuonuo
 * @create 2021-10-08 21:42
 */
public class AndroidFactory implements BaseAbstractFactory {

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }
}
