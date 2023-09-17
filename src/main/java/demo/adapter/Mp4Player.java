package demo.adapter;

/**
 * @learner lmeng
 * @date 2023/9/17
 * @des AdvancedMediaPlayer的实现类Mp4Player
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //什么都不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("mp4Player play mp4 filename : " + fileName);
    }
}
