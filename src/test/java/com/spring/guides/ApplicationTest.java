package com.spring.guides;

import com.spring.guides.tasks.ScheduledTasks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author xuejiaqing@do-global.com
 * @version 1.0.0
 * @since 2019/12/5 5:12 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class ApplicationTest {

    @SpyBean
    ScheduledTasks tasks;

    @Test
    public void contextLoads() {
        assertThat(tasks).isNotNull();
    }
}
