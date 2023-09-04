package com.xingchen.xingchenojJudgeServicee.judge.strategy;


import com.xingchen.xingchenojModel.codesandbox.model.JudgeInfo;
import com.xingchen.xingchenojModel.dto.question.JudgeCase;
import com.xingchen.xingchenojModel.entity.Question;
import com.xingchen.xingchenojModel.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
