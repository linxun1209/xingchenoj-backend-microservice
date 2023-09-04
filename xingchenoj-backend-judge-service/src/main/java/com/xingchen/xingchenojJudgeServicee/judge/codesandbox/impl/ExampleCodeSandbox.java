package com.xingchen.xingchenojJudgeServicee.judge.codesandbox.impl;


import com.xingchen.xingchenojJudgeServicee.judge.codesandbox.CodeSandbox;
import com.xingchen.xingchenojModel.codesandbox.model.ExecuteCodeRequest;
import com.xingchen.xingchenojModel.codesandbox.model.ExecuteCodeResponse;


import com.xingchen.xingchenojModel.codesandbox.model.JudgeInfo;
import com.xingchen.xingchenojModel.enums.JudgeInfoMessageEnum;
import com.xingchen.xingchenojModel.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 示例代码沙箱（仅为了跑通业务流程）
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
