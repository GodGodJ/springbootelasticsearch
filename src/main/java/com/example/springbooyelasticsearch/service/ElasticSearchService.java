package com.example.springbooyelasticsearch.service;

public interface ElasticSearchService {

    void insertById(String index,String type,String id,String jsonStr);

    void updateById(String index,String type,String id,String jsonStr);

    void deteleById(String index,String type,String id);

}
