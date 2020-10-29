package com.igoso.me.autoconfigure;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
public class GreeterCondition implements Condition{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        boolean matchResult = conditionContext.getEnvironment().containsProperty("spring.es.config.clusterName");
        return matchResult;
    }
}
