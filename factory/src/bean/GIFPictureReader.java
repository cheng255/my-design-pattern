package bean;

/**
 * @author nuonuo
 * @create 2021-10-08 19:32
 */
public class GIFPictureReader extends PictureReader{
    @Override
    public void readPicture() {
        System.out.println("正在读取GIF图片,地址为");
    }

    @Override
    public void doSomething() {
        System.out.println("正在处理GIF图片...");
    }
}
