package com.aman.consistentHashing.config;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class ServerConfig {
    
    private String serverIp;
    private String servicePort;




}
