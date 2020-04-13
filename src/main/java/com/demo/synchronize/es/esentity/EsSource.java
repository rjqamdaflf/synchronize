package com.demo.synchronize.es.esentity;


import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @author Administrator
 */
@Data
@ToString
@Document(indexName = "source_test")
public class EsSource implements Serializable {
    @Id
    private int id;
    private int kgId;
    private int nodeId;
    private int createrId;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String sourceName;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String sourceDesc;
}
