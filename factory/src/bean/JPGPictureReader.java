package bean;

/**
 * @author nuonuo
 * @create 2021-10-08 19:33
 */
public class JPGPictureReader extends PictureReader {
    @Override
    public void readPicture() {
        System.out.println("正在读取JPG图片,地址为");
    }

    @Override
    public void doSomething() {
        System.out.println("正在处理JPG图片...");
    }
}