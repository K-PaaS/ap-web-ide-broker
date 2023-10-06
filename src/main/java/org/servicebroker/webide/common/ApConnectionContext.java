package org.servicebroker.webide.common;

import org.cloudfoundry.reactor.DefaultConnectionContext;

import java.util.Date;

public class ApConnectionContext extends ApContextInterface {

    DefaultConnectionContext connectionContext;
    Date create_time;

    public ApConnectionContext(DefaultConnectionContext connectionContext, Date create_time){
        this.connectionContext = connectionContext;
        this.create_time = create_time;
    }

    public DefaultConnectionContext getConnectionContext() {
        return connectionContext;
    }

    @Override
    public Date getCreate_time() {
        return create_time;
    }
}
