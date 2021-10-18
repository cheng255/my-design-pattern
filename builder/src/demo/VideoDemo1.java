package demo;

import bean.Video;
import builder.CompleteVideoBuilder;
import builder.VideoBuilder;
import controller.VideoController;

/**
 * @author nuonuo
 * @create 2021-10-09 21:02
 */
public class VideoDemo1 {


    public static void main(String[] args) {
        VideoBuilder builder = new CompleteVideoBuilder();
        VideoController controller = new VideoController();
        Video video = controller.construct(builder);
        System.out.println(video);
    }
}
