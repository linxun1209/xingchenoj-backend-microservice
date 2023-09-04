package com.xingchen.xingchenojModel.codesandbox.impl;



import com.xingchen.xingchenojModel.codesandbox.CodeSandbox;
import com.xingchen.xingchenojModel.codesandbox.model.ExecuteCodeRequest;
import com.xingchen.xingchenojModel.codesandbox.model.ExecuteCodeResponse;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 * @author xing'chen
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}

