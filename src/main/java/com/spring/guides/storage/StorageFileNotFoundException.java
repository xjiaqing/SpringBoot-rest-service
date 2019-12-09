package com.spring.guides.storage;

/**
 * @author xuejiaqing@do-global.com
 * @version 1.0.0
 * @since 2019/12/6 11:27 上午
 */
public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
