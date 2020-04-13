package com.demo.synchronize.es.esdao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

@SpringBootApplication
@SpringBootTest
class EsCourseJpaTest {

    @Resource
    private ApplicationContext applicationContext;

    @Test
    public void test1() {
        System.out.println(applicationContext);
        Object esChapterJpa = applicationContext.getBean("esChapterJpa");
        System.out.println(esChapterJpa);
    }

}