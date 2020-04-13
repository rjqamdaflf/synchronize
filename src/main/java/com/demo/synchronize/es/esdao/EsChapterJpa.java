package com.demo.synchronize.es.esdao;


import com.demo.synchronize.es.esentity.EsChapter;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 84271
 */

public interface EsChapterJpa extends ElasticsearchRepository<EsChapter, Integer> {

}
