package com.spring.guides;

import com.spring.guides.tasks.ScheduledTasks;
import org.awaitility.Duration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

/**
 * @author xuejiaqing@do-global.com
 * @version 1.0.0
 * @since 2019/12/5 5:18 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ScheduledTasksTest {
    @SpyBean
    ScheduledTasks tasks;

    @Test
    public void reportCurrentTime() {
        await().atMost(Duration.TEN_SECONDS).untilAsserted(
                () -> verify(tasks, atLeast(2)).reportCurrentTime()
        );
    }
}
