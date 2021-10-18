package bean;

import java.util.List;

/**
 * @author nuonuo
 * @create 2021-10-09 20:41
 */
public class Video {
    private String menu;//菜单
    private List<String> playList;//播放列表
    private String mainWindow;//主窗口
    private String controlBar;//控制条
    private List<String> favoriteList;//收藏列表


    public Video() {
    }

    @Override
    public String toString() {
        return "Video{" +
                "menu='" + menu + '\'' +
                ", playList=" + playList +
                ", mainWindow='" + mainWindow + '\'' +
                ", controlBar='" + controlBar + '\'' +
                ", favoriteList=" + favoriteList +
                '}';
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public List<String> getPlayList() {
        return playList;
    }

    public void setPlayList(List<String> playList) {
        this.playList = playList;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }

    public List<String> getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(List<String> favoriteList) {
        this.favoriteList = favoriteList;
    }
}
