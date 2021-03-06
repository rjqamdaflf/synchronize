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
 *
 */
@Data
@ToString
@Document(indexName = "course_test")
public class EsCourse implements Serializable {
	@Id
	private int courseId;
	@Field(type = FieldType.Text, analyzer = "ik_max_word")
	private String courseName;
	@Field(type = FieldType.Text, analyzer = "ik_max_word")
	private String courseDesc;
	private int nodeId;
	private int schoolId;
	private int createrId;

}
