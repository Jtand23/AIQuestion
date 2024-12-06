package com.yupi.aibackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.aibackend.model.entity.UserAnswer;
import com.yupi.aibackend.service.UserAnswerService;
import com.yupi.aibackend.mapper.UserAnswerMapper;
import org.springframework.stereotype.Service;

/**
* @author Lenovo
* @description 针对表【user_answer(用户答题记录)】的数据库操作Service实现
* @createDate 2024-12-06 09:56:51
*/
@Service
public class UserAnswerServiceImpl extends ServiceImpl<UserAnswerMapper, UserAnswer>
    implements UserAnswerService{

}




