package com.spring.guides.consumingrest;

import java.io.StringWriter;

/**
 * @author xuejiaqing@do-global.com
 * @version 1.0.0
 * @since 2019/12/5 5:43 下午
 */
public class Value {
    private Long id;
    private String quote;

    public Value() {}

    public Long getId() {
        return id;
    }

    private String getQuote() {
        return quote;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
