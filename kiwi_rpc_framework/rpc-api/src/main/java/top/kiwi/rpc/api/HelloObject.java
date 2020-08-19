package top.kiwi.rpc.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class HelloObject implements Serializable{  // 需要实现序列化接口，因为需要进行网络传输
    private Integer id;
    private String message;
}
