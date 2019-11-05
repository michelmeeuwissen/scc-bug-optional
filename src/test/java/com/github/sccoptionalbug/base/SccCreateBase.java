package com.github.sccoptionalbug.base;

import com.github.sccoptionalbug.Application;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SccCreateBase{
    @Autowired
    protected WebApplicationContext context;

    @Before
    public void initMockMvcServersAndConfigureMockTokenService() {
        RestAssuredMockMvc.webAppContextSetup(context);
    }
}

