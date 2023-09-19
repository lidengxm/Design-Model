package demo.proxy;

/**
 * @learner lmeng
 * @date 2023/9/19
 * @des 代理模式demo
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
//        通过代理对象来延迟加载真实对象的图片
        Image image = new ProxyImage("hahah.jpg");
        Image image2 = new ProxyImage("hahah2.jpg");

        //从磁盘image中加载图像
        image.display();
        image2.display();
        System.out.println();

        //图像不需要从磁盘加载
        image.display();
    }
}
