package com.aman.consistentHashing.service;

import com.aman.consistentHashing.config.ChConfig;
import com.aman.consistentHashing.config.ServerConfig;

interface ConsistentHashingService {

    //Get the server  with the data having "key"
    String getServer(String key);
    

    //Add the server as serverConfig to the hashing 
    String addServer(ServerConfig serverConfig);


    //Replicate data 
    boolean replicateData(String data);


    
    void init(ChConfig chConfig);






    



}
