package demo.adapter;

/**
 * @learner lmeng
 * @date 2023/9/17
 * @des AdvancedMediaPlayer的实现类VlcPlayer
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("vlcPlayer play vlc  filename : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么都不做
    }
}
