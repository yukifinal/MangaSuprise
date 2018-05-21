package com.example.model;

import java.util.List;

import lombok.Data;

@Data
public class Chapter {

	private String chapterDescription;
	private String modifyDate;
	private List<ImagePhoto> image;
}
