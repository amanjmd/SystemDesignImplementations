package com.aman.consistentHashing.config;

import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "consistent-hashing")
public class ChConfig{

        private Set<ServerConfig> servers;

        private Integer replicationFactor ;



}