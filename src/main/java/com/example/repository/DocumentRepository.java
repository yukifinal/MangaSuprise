package com.example.repository;

import com.example.model.DocumentModel;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface DocumentRepository<T extends DocumentModel> extends ElasticsearchRepository<T, String> {

}
