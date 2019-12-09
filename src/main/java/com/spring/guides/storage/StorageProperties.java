package com.spring.guides.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xuejiaqing@do-global.com
 * @version 1.0.0
 * @since 2019/12/6 11:26 上午
 */
@ConfigurationProperties("storage")
public class StorageProperties {
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
