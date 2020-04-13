package com.demo.synchronize.es.esdao;


import com.demo.synchronize.es.esentity.EsSource;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 84271
 */
public interface EsSourceJpa extends ElasticsearchRepository<EsSource, Integer> {
}
