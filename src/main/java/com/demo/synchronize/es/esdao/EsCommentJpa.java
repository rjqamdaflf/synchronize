package com.demo.synchronize.es.esdao;


import com.demo.synchronize.es.esentity.EsComment;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 84271
 */

public interface EsCommentJpa extends ElasticsearchRepository<EsComment, Integer> {
}
