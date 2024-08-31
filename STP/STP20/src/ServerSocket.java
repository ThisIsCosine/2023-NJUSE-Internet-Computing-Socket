import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerSocket {
    private boolean established = false;  // 连接建立状态，默认是false，未建立连接
    private boolean LISTEN = false; // 监听状态,仅用于连接建立
    private boolean SYN_RCVD = false; // 同步信息已收到等待确认状态，仅用于连接建立
    private boolean CLOSE_WAIT = false; // 释放等待状态，仅用于连接释放
    private boolean LAST_ACK = false; // 最后确认状态，仅用于连接释放
    private DatagramSocket server;
    private byte[] revMem; // 接收缓存，存储字节流
    private int rMLen; // 接收缓存大小
    private byte[] revWin; // 接收窗口，存储字节流
    private int rWLen; // 接收窗口大小
    private int rWHeadPoint; // 接收窗口指针，指向发送窗口首部
    private int rWMiddlePoint; // 接收窗口指针，此指针前的发送窗口部分为已发送数据，后的发送窗口部分为待发送数据
    private int rWTailPoint; // 接收窗口指针，指向发送窗口末尾

    /**
     * 绑定ServerSocket到本地
     */
    public ServerSocket(){
        // TODO
    }

    /**
     * @param port 指定的本地端口号
     */
    public ServerSocket(int port){
        // TODO
    }

    /**
     *
     * @param port 指定的本地端口号
     * @param addr 指定的本地IP地址
     */
    public ServerSocket(int port, InetAddress addr){
        // TODO
    }

    public static void main(String[] args) {
        // 调试内容
    }
}
