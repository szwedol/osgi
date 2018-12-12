package com.gft.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

@Component(service=ComponentImpl.class)
@JaxrsResource
public class ComponentImpl {
    
    @Path("rest/upper/{param}")
    @GET
    public String toUpper(@PathParam("param") String param) {
        return param.toUpperCase();
    }
}