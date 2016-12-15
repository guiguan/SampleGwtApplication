package com.southbanksoftware.samplegwtapplication.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("SampleGwtApplicationService")
public interface SampleGwtApplicationService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use SampleGwtApplicationService.App.getInstance() to access static instance of SampleGwtApplicationServiceAsync
     */
    public static class App {
        private static SampleGwtApplicationServiceAsync ourInstance = GWT.create(SampleGwtApplicationService.class);

        public static synchronized SampleGwtApplicationServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
