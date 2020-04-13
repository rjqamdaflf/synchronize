package com.demo.synchronize.util;

import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Field;

/**
 * @program: synchronize
 * @ClassName: ClassUtils
 * @Description: 将json转实例化成类对象
 * @Author: 842712494@qq.com
 * @Date: 2020/4/12 9:35
 * @Version: 1.0.0
 */
public class ClassUtils {
    public static Object getEsClass(String className, String object) {
        Class beanClass = null;
        Object bean;
        try {
            // 加载 beanClass
            beanClass = Class.forName(className);
            bean = beanClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        JSONObject jsonObject = JSONObject.parseObject(object);
        jsonObject.keySet().forEach(s -> {
            try {
                // 利用反射将 bean 相关字段访问权限设为可访问
                Field declaredField = bean.getClass().getDeclaredField(s);
                declaredField.setAccessible(true);
                //获取对应属性值
                Object value = jsonObject.get(s);
                // 将属性值填充到相关字段中
                declaredField.set(bean, value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return bean;
    }
}
