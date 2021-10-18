package builder;

import bean.Video;

/**
 * 建造者
 * @author nuonuo
 * @create 2021-10-09 20:49
 */
public abstract class VideoBuilder {

    protected Video video = new Video();

    public abstract void buildEenu();
    public abstract void buildPlayList();
    public abstract void buildMainWindow();
    public abstract void buildControlBar();
    public abstract void buildFavoriteList();

    public Video createActor() {
        return video;
    }



}
