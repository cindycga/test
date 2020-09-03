package org.gtri.gamest.lambda;

import org.gtri.gamest.serverless.api.annotation.Deployment;
import org.gtri.gamest.serverless.api.annotation.ServerlessFunction;

public class HelloWorldFunction {
    
    @ServerlessFunction
    @Deployment(functionName="HelloWorldFunction", topicList = {"HELLO_WORLD"})
    public String sayHello() { return "Hello, World!";}

}
