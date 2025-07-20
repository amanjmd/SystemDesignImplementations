package com.aman.consistentHashing.service;

import com.aman.consistentHashing.config.ChConfig;
import com.aman.consistentHashing.config.ServerConfig;

public class ConsistentHashingImpl implements ConsistentHashingService{

    

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
        
    }


    
}
