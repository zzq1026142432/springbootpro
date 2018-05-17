package com.zzq.test;

import com.zzq.common.Exception.vo.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 170180 on 2018/5/17.
 */
@Controller
@RequestMapping(value = "pro/utilTest")
public class TestController {

    @RequestMapping(value = "/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
}
