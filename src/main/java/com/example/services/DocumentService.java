package com.example.services;

import com.example.model.DocumentModel;

public interface DocumentService {

	DocumentModel findById(String id) throws Exception;
	DocumentModel updateContentFile(String id, byte[] byteArray) throws Exception;
	DocumentModel getContent(String id) throws Exception;
	
}
