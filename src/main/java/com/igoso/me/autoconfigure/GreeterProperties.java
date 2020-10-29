package com.igoso.me.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "igoso.greeter")
public class GreeterProperties {
    private String userName;
    private String morningMsg;
    private String afternoonMsg;
    private String eveningMsg;
    private String nightMsg;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMorningMsg() {
        return morningMsg;
    }

    public void setMorningMsg(String morningMsg) {
        this.morningMsg = morningMsg;
    }



    public String getEveningMsg() {
        return eveningMsg;
    }

    public void setEveningMsg(String eveningMsg) {
        this.eveningMsg = eveningMsg;
    }

    public String getNightMsg() {
        return nightMsg;
    }

    public void setNightMsg(String nightMsg) {
        this.nightMsg = nightMsg;
    }

    public String getAfternoonMsg() {
        return afternoonMsg;
    }

    public void setAfternoonMsg(String afternoonMsg) {
        this.afternoonMsg = afternoonMsg;
    }

    @Configuration
    @ConditionalOnClass(Greeter.class)
    @ConditionalOnProperty(prefix = "igoso.greeter",value = "enable",matchIfMissing = true)
    @EnableConfigurationProperties(GreeterProperties.class)
    public static class GreeterAutoConfiguration {

        @Bean
        @ConditionalOnMissingBean
        public Greeter greeter() {
            return new Greeter();
        }
    }
}
