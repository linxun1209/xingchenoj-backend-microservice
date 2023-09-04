package com.xingchen.xingchenojModel.codesandbox.model;

import lombok.Data;

/**
 * 判题信息
 * @author xing'chen
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;

    /**
     * 消耗时间（KB）
     */
    private Long time;
}
