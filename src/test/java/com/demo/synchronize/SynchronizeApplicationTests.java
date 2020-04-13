package com.demo.synchronize;

import com.alibaba.fastjson.JSONObject;
import com.demo.synchronize.es.esdao.EsNodeJpa;
import com.demo.synchronize.es.esentity.EsChapter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SynchronizeApplicationTests {

    @Resource
    private EsNodeJpa esNodeJpa;

    @Test
    public void contextLoads() {
        esNodeJpa.findAll().forEach(esNode -> System.out.println(esNode));
    }

    @Test
    public void test1() {
        EsChapter esChapter = new EsChapter();
        esChapter.setChapterDesc("abcde");
        esChapter.setChapterId(1);
        esChapter.setChapterName("name");
        esChapter.setCourseId(2);
        esChapter.setNodeId(3);
        esChapter.setCreaterId(8);
        String s = JSONObject.toJSONString(esChapter);
        System.out.println(s);
        JSONObject.parseObject(s);
        EsChapter esChapter1 = JSONObject.toJavaObject(JSONObject.parseObject(s), EsChapter.class);
        System.out.println(esChapter1);
        //  ClassUtils.getEsClass("com.demo.synchronize.es.esentity.EsChapter", )
    }

}
