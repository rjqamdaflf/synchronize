
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
@Document(indexName = "node_test")
public class EsNode implements Serializable {  //结点信息
    @Id
    private int id;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String name;
    private String value;
    private int category;
    private int symbolSize;
    private String url = "/login";
}
