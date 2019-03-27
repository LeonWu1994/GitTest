package com.smsLisener;

import com.aliyuncs.exceptions.ClientException;
import com.itcast.smsUtile.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;



@Component
public class SmsLisener {

    @Autowired
    private SmsUtil smsUtil;

    @JmsListener(destination = "sms")
    /*public void sendCode(Map<String,String> map){
        System.out.println("监听到用户注册信息");
        try {
            smsUtil.sendSms(map.get("phoneNumber"),
                    map.get("template"),
                    map.get("signName"),
                    map.get("code"));
            System.out.println("成功将短信发送给用户!");
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }*/
    public void sendCode(Map<String,String> map){

        System.out.println("监听到用户注册信息");
        try {
            smsUtil.sendSms(map.get("phoneNumber"),
                    map.get("template"),
                    map.get("signName"),
                    map.get("code"));
            System.out.println("成功将短信发送给用户!");
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }


}
