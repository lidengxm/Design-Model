package demo.adapter;

/**
 * @learner lmeng
 * @date 2023/9/17
 * @des 播放适配器
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        //播放mp3
        audioPlayer.play("mp3", "小啊小二郎");
        audioPlayer.play("vlc", "iu");
        audioPlayer.play("mp4", "我的秋招vlog");
        //播放没有版权的类型
        audioPlayer.play("xlc", "二哥荡悠悠");
    }

}
