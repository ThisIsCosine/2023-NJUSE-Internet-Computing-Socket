import java.net.DatagramPacket;
import java.net.InetAddress;

public class STPPacket{
    private DatagramPacket packet;
    private int seq; // 序号
    private int ack; // 确认号
    private int offset; // 数据偏移
    private int winSize; // 窗口大小
    private boolean ACK = false; // 确认信号
    private boolean SYN = false; // 同步信号
    private boolean FIN = false; // 终止信号
    private byte[] data;
    private int dataLen;
    /**
     *
     * @param data 报文数据部分，字节流
     * @param dataLen 报文数据部分长度
     * @param addr 目的IP
     * @param port 目的端口号
     */
    public STPPacket(byte[] data, int dataLen, InetAddress addr, int port){
        // TODO
    }

    public static void main(String[] args) {
        // 调试内容
    }
}
