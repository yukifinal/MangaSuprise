package com.example.model;

import java.util.List;

import lombok.Data;

@Data
public class DocumentModel {
	
	private String ID;
	
	private String name;
	
	private ImagePhoto avatar;
	private String type;
	private String description;
	private String author;
	private String rate;
	private int viewCount;
	private int loveCount;
	private String modifyDate;
	private String categoryID;
	private String status;
	private List<Chapter> chapter;
	
}
