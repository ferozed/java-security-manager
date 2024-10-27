package io.github.ferozed.sm;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import io.github.ferozed.spring.bean.ZillowBeanDefinitionReader;
import io.github.ferozed.spring.config.SecurityManagerConfiguration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloWorldTest.TestContext.class)
public class HelloWorldTest {

    @Autowired
    private HelloWorld helloWorld;

    @Test
    public void testHelloWorld() {
        Assert.assertNotNull(helloWorld.hello());
    }


    @Configuration
    @ImportResource(value = "classpath:META-INF/zillow-environment-context.xml", reader = ZillowBeanDefinitionReader.class)
    @Import(SecurityManagerConfiguration.class )
    static class TestContext{

        //Add other required test beans/configuration/etc here
    }
}
