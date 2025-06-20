package localhost;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalhostDemo {
    public static void main(String[] args) throws UnknownHostException {
        
        InetAddress localhost = InetAddress.getLocalHost(); 
        System.out.println(localhost.getHostName());
        System.out.println(localhost.getHostAddress());
    }
}
