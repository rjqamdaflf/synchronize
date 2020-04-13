package com.demo.synchronize.es.esdao;


import com.demo.synchronize.es.esentity.EsKg;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 84271
 */
public interface EsKgJpa extends ElasticsearchRepository<EsKg, Integer> {
}
