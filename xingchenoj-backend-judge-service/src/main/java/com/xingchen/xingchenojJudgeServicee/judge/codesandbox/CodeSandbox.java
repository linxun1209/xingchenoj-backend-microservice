package com.xingchen.xingchenojJudgeServicee.judge.codesandbox;


import com.xingchen.xingchenojModel.codesandbox.model.ExecuteCodeRequest;
import com.xingchen.xingchenojModel.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
