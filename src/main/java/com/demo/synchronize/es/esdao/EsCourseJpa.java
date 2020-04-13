package com.demo.synchronize.es.esdao;


import com.demo.synchronize.es.esentity.EsCourse;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 84271
 */
public interface EsCourseJpa extends ElasticsearchRepository<EsCourse, Integer> {
}
