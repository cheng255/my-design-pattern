package builder;

import java.util.Collections;

/**
 * @author nuonuo
 * @create 2021-10-09 20:53
 */
public class CompleteVideoBuilder extends VideoBuilder{
    @Override
    public void buildEenu() {
        video.setMenu("完整模式的菜单");
    }

    @Override
    public void buildPlayList() {
        video.setPlayList(Collections.singletonList("完整模式的列表"));
    }

    @Override
    public void buildMainWindow() {

    }

    @Override
    public void buildControlBar() {

    }

    @Override
    public void buildFavoriteList() {

    }
}
