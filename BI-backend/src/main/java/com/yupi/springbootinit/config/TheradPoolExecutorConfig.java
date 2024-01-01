package com.yupi.springbootinit.config;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * ClassName: TheradPoolExecutorConfig
 * Package: com.yupi.springbootinit.config
 * Description:
 *
 * @Author lilray
 * @Create 2023/12/28 9:55
 * @Version 1.0
 */

@Configuration
public class TheradPoolExecutorConfig {

    @Bean
    public ThreadPoolExecutor threadPoolExecutor(){

        ThreadFactory threadFactory = new ThreadFactory() {
            private int count = 1;
            @Override
            public Thread newThread(@NotNull Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("线程" + count);
                count++;
                return thread;
            }
        };

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,4,
                100, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10000)
        ,threadFactory);

        return threadPoolExecutor;
    }

}
