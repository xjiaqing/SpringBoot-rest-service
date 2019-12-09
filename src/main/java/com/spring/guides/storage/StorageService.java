package com.spring.guides.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @author xuejiaqing@do-global.com
 * @version 1.0.0
 * @since 2019/12/5 7:37 下午
 */
public interface StorageService {
    /**
     * init
     */
    void init();

    /**
     * store
     *
     * @param file file
     */
    void store(MultipartFile file);

    /**
     * load all
     *
     * @return stream
     */
    Stream<Path> loadAll();

    /**
     * load
     *
     * @param filename filename
     *
     * @return file path
     */
    Path load(String filename);

    /**
     * load as resource
     *
     * @param filename filename
     *
     * @return resource
     */
    Resource loadAsResource(String filename);

    /**
     * delete all
     */
    void deleteAll();
}
