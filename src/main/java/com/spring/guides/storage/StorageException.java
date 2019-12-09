package com.spring.guides.storage;

/**
 * @author xuejiaqing@do-global.com
 * @version 1.0.0
 * @since 2019/12/6 11:28 上午
 */
public class StorageException extends RuntimeException {
    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
