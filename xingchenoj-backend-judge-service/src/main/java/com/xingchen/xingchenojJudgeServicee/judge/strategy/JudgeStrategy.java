package com.xingchen.xingchenojJudgeServicee.judge.strategy;


import com.xingchen.xingchenojModel.codesandbox.model.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
