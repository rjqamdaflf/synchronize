package com.demo.synchronize.es.esdao;


import com.demo.synchronize.es.esentity.EsNode;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 84271
 */
public interface EsNodeJpa extends ElasticsearchRepository<EsNode, Integer> {

}
