package com.xingchen.xingchenojJudgeServicee.judge;


import com.xingchen.xingchenojJudgeServicee.judge.strategy.DefaultJudgeStrategy;
import com.xingchen.xingchenojJudgeServicee.judge.strategy.JavaLanguageJudgeStrategy;
import com.xingchen.xingchenojJudgeServicee.judge.strategy.JudgeContext;
import com.xingchen.xingchenojJudgeServicee.judge.strategy.JudgeStrategy;
import com.xingchen.xingchenojModel.codesandbox.model.JudgeInfo;
import com.xingchen.xingchenojModel.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
