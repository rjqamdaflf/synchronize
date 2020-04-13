package com.demo.synchronize.es.esdao;


import com.demo.synchronize.es.esentity.EsSchool;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 84271
 */
public interface EsSchoolJpa extends ElasticsearchRepository<EsSchool, Integer> {
}
