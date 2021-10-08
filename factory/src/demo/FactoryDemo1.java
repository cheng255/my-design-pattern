package demo;

import bean.PictureReader;
import factory.PictureReaderFactory;
import utils.XMLUtil;

/**
 * @author nuonuo
 * @create 2021-10-08 19:38
 */
public class FactoryDemo1 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        PictureReaderFactory pictureReaderFactory = (PictureReaderFactory) XMLUtil.getBean();
        PictureReader pictureReader = pictureReaderFactory.createPictureReader();
        pictureReader.readPicture();
        pictureReader.doSomething();

//        Class<?> jpgPictureReaderFactory = ClassLoader.getSystemClassLoader().loadClass("factory.JPGPictureReaderFactory");
//        System.out.println(jpgPictureReaderFactory.newInstance());
    }
}
