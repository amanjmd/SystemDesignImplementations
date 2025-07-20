package com.aman.consistentHashing.service;

import com.aman.consistentHashing.config.ServerConfig;

public class HeartBeatTask implements Runnable{

    private ServerConfig serverConfig;
    public HeartBeatTask(ServerConfig config){
        this.serverConfig = config;
    }
    public void run(){
        // Send request to server 
        // retry 3 times in case failure 
        // raise exception in case any failures             
    }

}
