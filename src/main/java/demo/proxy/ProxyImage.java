package demo.proxy;

/**
 * @learner lmeng
 * @date 2023/9/19
 * @des 代理图像类
 */
public class ProxyImage implements Image{
    private String fileName;

    public RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
