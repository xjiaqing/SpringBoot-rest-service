package com.spring.guides.gsrestservice;

/**
 * @author xuejiaqing@do-global.com
 * @version 1.0.0
 * @since 2019/12/5 3:15 下午
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
