package top.dtyy.pattern.structural.facade;

/**
 * @author lzp
 * @version v1.0 at 2018/12/27
 */
public class Cpu implements IDevice {
    @Override
    public void startUp() {
        System.out.println("启动CPU");
    }

    @Override
    public void shutDown() {
        System.out.println("关闭CPU");
    }
}
