package controller;

import bean.Video;
import builder.VideoBuilder;

/**
 * @author nuonuo
 * @create 2021-10-09 20:56
 */
public class VideoController {
    public Video construct(VideoBuilder builder) {
        Video video;
        builder.buildEenu();
        builder.buildControlBar();
        builder.buildFavoriteList();
        builder.buildMainWindow();
        builder.buildPlayList();
        video = builder.createActor();
        return video;
    }
}
