package com.xingchen.xingchenojJudgeServicee.judge;


import com.xingchen.xingchenojModel.entity.QuestionSubmit;

/**
 * 判题服务
 */
public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
