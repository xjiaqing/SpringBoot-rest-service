package com.spring.guides.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author xuejiaqing@do-global.com
 * @version 1.0.0
 * @since 2019/12/5 5:42 下午
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
