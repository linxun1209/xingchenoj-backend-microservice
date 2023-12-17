package com.xingchen.xingchenquestionservice.controller.inner;


import com.xingchen.xingchenojModel.entity.Question;
import com.xingchen.xingchenojModel.entity.QuestionSubmit;
import com.xingchen.xingchenojService.QuestionFeignClient;
import com.xingchen.xingchenquestionservice.service.QuestionService;
import com.xingchen.xingchenquestionservice.service.QuestionSubmitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 该服务仅内部调用，不是给前端的
 */
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    @GetMapping("/get/id")
    @Override
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    }


    @PostMapping("/question/update")
    @Override
    public boolean updateQuestionById(@RequestBody Question question) {
        return questionService.updateById(question);
    }

    @GetMapping("/question_submit/get/id")
    @Override
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") long questionSubmitId) {
        return questionSubmitService.getById(questionSubmitId);
    }

    @PostMapping("/question_submit/update")
    @Override
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }





}
