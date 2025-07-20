package com.aman.consistentHashing.service;


public interface RoutingService {

    Object getData(String key);

    Boolean setData(Object data ,String key);

    
    
}
