package com.taoqian.duty.service.impl;

import com.taoqian.duty.constant.ResultCodeConst;
import com.taoqian.duty.dao.TestDao;
import com.taoqian.duty.entity.Result;
import com.taoqian.duty.entity.TestDO;
import com.taoqian.duty.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service接口的实现类，具体的业务逻辑都是在这里实现的
 */
// 通过@Service注解，将该类注入到Spring容器中，这样在TestController中，就可以通过@Autowird注解，获取到了
@Service
public class TestSericeImpl implements TestService {

    // Autowired注解，就是从Spring容器中获取一个Testdao实例
    @Autowired
    private TestDao testDao;

    /**
     * @return Result, 这个类是自己定义的，一般返回结果我们都会自己定义固定的格式去返回，录入Result，
     * 就是声明了返回结果的状态码，返回的状态信息以及返回的具体数据
     */
    @Override
    public Result test() {
        TestDO test = testDao.test();
        if (test == null) {
            return Result.of(ResultCodeConst.PARAMETER_INVALID_CODE, ResultCodeConst.PARAMETER_INVALID_MSG);
        }
        return Result.of(test);
    }
}
