package top.kiwi.rpc.api;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class HelloServiceImpl implements HelloService{
    @Override
    public String hello(HelloObject object) {
        Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);
        logger.info("接收到");
        logger.info(object.getMessage());
        logger.info("接收到", object.getMessage());

        return "这是用掉的返回值，id=" + object.getId();
    } // 实现HelloService接口

    public static void main(String[] args) {
        HelloServiceImpl hs = new HelloServiceImpl();
        String nihao = hs.hello(new HelloObject(10, "nihao"));
        System.out.println(nihao);
    }

}
