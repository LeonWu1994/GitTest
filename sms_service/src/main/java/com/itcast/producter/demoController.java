package com.itcast.producter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class demoController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate ;

    @RequestMapping("/springbootDemo.do")
    public void SpringBootDemo( ){
        System.out.println("SpringBoot启动成功！");
        Map map = new HashMap();
        map.put("phoneNumber","18659047998");
        map.put("template","SMS_144943640");
        map.put("signName","品优购");
        map.put("code","123456");
        jmsMessagingTemplate.convertAndSend("sms",map);
        System.out.println("短信发送！");
    }
}
