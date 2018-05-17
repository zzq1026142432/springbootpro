package com.zzq.common.Exception.ctr;

import com.zzq.common.Exception.vo.ErrorInfo;
import com.zzq.common.Exception.vo.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 170180 on 2018/5/17.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest httpServletRequest , MyException e)throws Exception{
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorInfo.ERROR);
        r.setData("somedata");
        r.setUrl(httpServletRequest.getRequestURL().toString());
        return  r;
    }
}
