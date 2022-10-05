package ss21_structural_design._1_proxy_design;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {
    private static List<String> blackList = new ArrayList<>();
    private InternetReal internetReal = new InternetReal();
    static {
        blackList.add("facebook");
        blackList.add("zalo");
    }
    @Override
    public void connectTo(String serverHost) throws Exception {
        if (blackList.contains(serverHost)) {
            throw new Exception("Đang học, bạn không thể vào trang này!!!");
        }
        internetReal.connectTo(serverHost);
    }
}
