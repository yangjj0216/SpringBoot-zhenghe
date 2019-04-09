package com.zwc.user.mq.queue;

import com.zwc.core.constants.ActiveMQConstants;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @ClassName MqQueueConsumerTwo
 * @Desc TODO   ActiveMQ    queue 列队模式 - 消费方 二号
 * @Date 2019/4/8 17:44
 * @Version 1.0
 */
@Service
public class MqQueueConsumerTwo {

    /*
     * @ClassName MqQueueConsumerTwo
     * @Desc TODO   接收列队消息
     * @Date 2019/4/8 17:48
     * @Version 1.0
     */
    @JmsListener(destination = ActiveMQConstants.QUEUE_NAME , containerFactory = "queueListenerFactory")
    public void receiveQueueMessage(String message){
        System.out.println("MqQueueConsumerTwo ---> receiveQueueMessage：接收列队模式发送的消息，内容为：" + message);
    }

}