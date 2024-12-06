package com.yupi.aibackend;

import com.zhipu.oapi.ClientV4;
import com.zhipu.oapi.Constants;
import com.zhipu.oapi.service.v4.model.ChatCompletionRequest;
import com.zhipu.oapi.service.v4.model.ChatMessage;
import com.zhipu.oapi.service.v4.model.ChatMessageRole;
import com.zhipu.oapi.service.v4.model.ModelApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ChatGLMTest {

    @Test
    public void test() {
        String apiKey = "43c3b76cdcaff5404f3b5681c3a1bd52.Z0N66dPTc8N8uq8D";
        ClientV4 client = new ClientV4.Builder(apiKey).build();
        //构造请求
        List<ChatMessage> messages = new ArrayList<>();
        ChatMessage chatMessage = new ChatMessage(ChatMessageRole.USER.value(), "作为一名营销专家，请为AI答题平台创作一个吸引人的slogan");
        messages.add(chatMessage);
        String requestId = String.valueOf(System.currentTimeMillis());
        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest.builder()
                .model(Constants.ModelChatGLM4)
                .stream(Boolean.FALSE)
                .invokeMethod(Constants.invokeMethod)
                .messages(messages)
                .requestId(requestId)
                .build();
        //调用
        ModelApiResponse invokeModelApiResp = client.invokeModelApi(chatCompletionRequest);
        System.out.println("模型输出结果：" + invokeModelApiResp);
    }
}
