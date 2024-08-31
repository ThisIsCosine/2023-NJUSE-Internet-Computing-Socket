import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * STP可靠通信的客户端，单工通信的数据发送方，类似TCP通信中的Client
 */
public class ClientSocket {

    private boolean established = false;  // 连接建立状态，默认是false，未建立连接
    private boolean SYS_SENT = false; // 同步信息已发送状态，仅用于连接建立过程
    private boolean FIN_WAIT1 = false; // 终止信息等待状态1，仅用于连接释放过程
    private boolean FIN_WAIT2 = false; // 终止信息等待状态2，仅用于连接释放过程
    private boolean TIME_WAIT = false; // 等待状态，仅用于连接释放过程；
    private DatagramSocket client; // client端的UDP Socket
    private byte[] sendMem; // 发送缓存，存储字节流
    private int sMLen; // 发送缓存大小
    private byte[] sendWin; // 发送窗口，存储字节流
    private int sWLen; // 发送窗口大小
    private int sWHeadPoint; // 发送窗口指针，指向发送窗口首部
    private int sWMiddlePoint; // 发送窗口指针，此指针前的发送窗口部分为已发送数据，后的发送窗口部分为待发送数据
    private int sWTailPoint; // 发送窗口指针，指向发送窗口末尾

    /**
     * 绑定ClientSocket到本地
     */
    public ClientSocket(){
        // TODO
    }

    /**
     * @param port 指定的本地端口号
     */
    public ClientSocket(int port){
        // TODO
    }

    /**
     *
     * @param port 指定的本地端口号
     * @param addr 指定的本地IP地址
     */
    public ClientSocket(int port, InetAddress addr){
        // TODO
    }

    public static void main(String[] args) {
        // 调试内容
    }
}
