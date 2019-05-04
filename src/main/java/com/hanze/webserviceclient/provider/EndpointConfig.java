package com.hanze.webserviceclient.provider;

/**
 * Created by Hanze on 2019/5/4.
 */

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EndpointConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint =
                new EndpointImpl(bus, new HelloWorldImpl());
        endpoint.publish("/helloworld");

        return endpoint;
    }
}