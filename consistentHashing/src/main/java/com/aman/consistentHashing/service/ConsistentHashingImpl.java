package com.aman.consistentHashing.service;

import java.util.HashMap;

import com.aman.consistentHashing.config.ChConfig;
import com.aman.consistentHashing.config.ServerConfig;

public class ConsistentHashingImpl implements ConsistentHashingService{

    private HashMap<String,ServerConfig> hashingRing;

    @Override
    public String getServer(String key) {
        throw new UnsupportedOperationException("Unimplemented method 'getServer'");
    }

    @Override
    public String addServer(ServerConfig serverConfig) {
        throw new UnsupportedOperationException("Unimplemented method 'addServer'");
    }

    @Override
    public boolean replicateData(String data) {
        throw new UnsupportedOperationException("Unimplemented method 'replicateData'");
    }

    @Override
    public void init(ChConfig chConfig) {
        
        hashingRing = new HashMap();
        chConfig.getServers().forEach(server ->{
            hashingRing.put(getServerHash(server), server);
        });


    }


    private String getServerHash(ServerConfig config){

        //TODO Added logic for calculating server hash for placing to the hashRing 
        //Facing problem to get the logic for hashing 
        return "";

    }


    
}
