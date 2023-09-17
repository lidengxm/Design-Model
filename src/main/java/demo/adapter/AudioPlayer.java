package demo.adapter;

/**
 * @learner lmeng
 * @date 2023/9/17
 * @des 适配器模式demo
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //AudioPlayer本身就可以播放mp3的音乐
        if(audioType.equals("mp3")) {
            System.out.println(audioType + " play mp3 filename : " + fileName);
        } else if (audioType.equals("vlc") || audioType.equals("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        } else {
            //不支持的类型
            System.out.println("play nothing file... unsupported!");
        }
    }
}
