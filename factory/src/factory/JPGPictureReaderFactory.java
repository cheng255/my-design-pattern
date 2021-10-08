package factory;

import bean.JPGPictureReader;
import bean.PictureReader;

/**
 * @author nuonuo
 * @create 2021-10-08 19:37
 */
public class JPGPictureReaderFactory implements PictureReaderFactory{
    @Override
    public PictureReader createPictureReader() {
        System.out.println("正在创建JPG图片读取器");
        return new JPGPictureReader();
    }
}
