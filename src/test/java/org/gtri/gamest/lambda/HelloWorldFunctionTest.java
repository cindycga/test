package org.gtri.gamest.lambda;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class HelloWorldFunctionTest {

    @Test
    public void testHelloWorldFunction(){
        HelloWorldFunction hwf = new HelloWorldFunction();
        String response = hwf.sayHello();
        assertThat(response, notNullValue());
        assertThat(response, equalTo("Hello, World!"));
    }

}