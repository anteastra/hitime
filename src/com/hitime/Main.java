package com.hitime;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {
  public static void main(String[] args) throws Exception {
    
    Server server = new Server(8080);
    
    
    WebAppContext hitime = new WebAppContext();
    
    hitime.setResourceBase("hitime");
    hitime.setContextPath("/");
    hitime.setDescriptor("WEB-INF/web.xml");
    //hitime.setParentLoaderPriority(true);
    
    server.setHandler(hitime);
    
    server.start();
    server.join();
  }
}