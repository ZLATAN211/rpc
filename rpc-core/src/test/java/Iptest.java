import com.cxl.rpc.util.IpUtil;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Iptest {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost());
        System.out.println(IpUtil.getLocalAddress());
    }
}
