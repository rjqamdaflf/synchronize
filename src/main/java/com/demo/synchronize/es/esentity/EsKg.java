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
@Document(indexName = "kg_test")
public class EsKg  implements Serializable {
	@Id
	private int kgId;
	@Field(type = FieldType.Text, analyzer = "ik_max_word")
	private String kgName;
	@Field(type = FieldType.Text, analyzer = "ik_max_word")
	private String kgDesc;
	private int nodeId;
	private int createrId;
	private int courseId;
	private int chapterId;

}
