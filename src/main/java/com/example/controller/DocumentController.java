package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.DocumentService;

@RestController
@RequestMapping("/documents")
public class DocumentController {

	private DocumentService documentService;
}
