package com.aman.consistentHashing.service;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aman.consistentHashing.config.ChConfig;

@Component
public class HeartbeatService {

    @Autowired
    private ConsistentHashingService hashingService;

    private ExecutorService executorService = null;

    private ChConfig chConfig;

    public HeartbeatService(ChConfig chConfig) {
        this.chConfig = chConfig;
    }

    public void init() {
        if (Objects.isNull(executorService)) {
            executorService = Executors.newFixedThreadPool(chConfig.getServers().size());
            chConfig.getServers().forEach(serverConfig -> {
                executorService.submit(new HeartBeatTask(serverConfig));
            });
        }


    }

}
