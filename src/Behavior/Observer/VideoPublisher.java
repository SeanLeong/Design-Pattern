package Behavior.Observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName: VideoPublisher
 * @Description:
 * @author: SeanLeong
 * @date: 2020/10/31 10:39
 */
public class VideoPublisher extends Publisher {

    public VideoPublisher(String title) {
        super(title);
    }

    public VideoPublisher() {
        super();
    }

    @Override
    public void update(String title) {
        System.out.println("更新了视频内容:" + title);
        this.publish();
    }
}
