package com.example.springbooyelasticsearch.service;

public interface BulkProcessirService {

    void insertById(String index,String type,String id,String jsonStr);

    void updateById(String index,String type,String id,String jsonStr);

    void deleteById(String index,String type,String id);

}
