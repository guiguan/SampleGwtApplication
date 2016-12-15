package com.southbanksoftware.samplegwtapplication.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SampleGwtApplicationServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
