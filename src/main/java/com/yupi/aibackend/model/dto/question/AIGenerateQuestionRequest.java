package com.yupi.aibackend.model.dto.question;

import lombok.Data;
import java.io.Serializable;

/**
 * AI生成题目请求
 */
@Data
public class AIGenerateQuestionRequest implements Serializable {
    /**
     * 应用 id
     */
    private Long appId;

    /**
     * 题目数
     */
    int questionNumber = 10;

    /**
     * 选项数
     */
    int optionNumber = 2;

    private static final long serialVersionUID = 1L;
}
