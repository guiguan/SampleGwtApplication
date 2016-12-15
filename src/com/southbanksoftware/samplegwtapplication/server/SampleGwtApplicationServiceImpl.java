package com.southbanksoftware.samplegwtapplication.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.southbanksoftware.samplegwtapplication.client.SampleGwtApplicationService;

public class SampleGwtApplicationServiceImpl extends RemoteServiceServlet implements SampleGwtApplicationService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}