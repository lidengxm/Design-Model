package demo.proxy;

/**
 * @learner lmeng
 * @date 2023/9/19
 * @des 真实图像类
 */
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("real image play fileName = " + fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.println("load disk filename = " + fileName);
    }
}
