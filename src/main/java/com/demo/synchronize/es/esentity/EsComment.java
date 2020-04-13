package com.demo.synchronize.es.esentity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 84271
 */
@Data
@ToString
@Document(indexName = "comment_test")
public class EsComment implements Serializable {
    /**
     * @Description:  评论id
     */
    @Id
    private int id;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    /**
     * @Description:   评论内容
     */
    private String commentContent;
    @Field(type = FieldType.Text)
    /**
     * @Description: 评论发表时间
     */
    private Date ctime;

}
