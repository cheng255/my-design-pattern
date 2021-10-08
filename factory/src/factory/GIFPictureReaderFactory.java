package factory;


import bean.GIFPictureReader;
import bean.PictureReader;

/**
 * @author nuonuo
 * @create 2021-10-08 19:35
 */
public class GIFPictureReaderFactory implements PictureReaderFactory {

    @Override
    public PictureReader createPictureReader() {
        System.out.println("正在创建GIF图片读取器");
        return new GIFPictureReader();
    }
}
