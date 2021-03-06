package cn.zhangxd.mimiron.config;

import cn.zhangxd.mimiron.core.async.ExceptionHandlingAsyncTaskExecutor;
import cn.zhangxd.mimiron.core.config.MimironProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
@EnableScheduling
public class AsyncConfiguration implements AsyncConfigurer {

    private final Logger log = LoggerFactory.getLogger(AsyncConfiguration.class);

    private final MimironProperties mimironProperties;

    public AsyncConfiguration(MimironProperties mimironProperties) {
        this.mimironProperties = mimironProperties;
    }

    @Override
    @Bean(name = "taskExecutor")
    public Executor getAsyncExecutor() {
        log.debug("Creating Async Task Executor");
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(mimironProperties.getAsync().getCorePoolSize());
        executor.setMaxPoolSize(mimironProperties.getAsync().getMaxPoolSize());
        executor.setQueueCapacity(mimironProperties.getAsync().getQueueCapacity());
        executor.setThreadNamePrefix("uaa-Executor-");
        return new ExceptionHandlingAsyncTaskExecutor(executor);
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new SimpleAsyncUncaughtExceptionHandler();
    }
}
