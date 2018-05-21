package com.example.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;

import lombok.Data;

@Data
public class ImagePhoto {

	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(length = 16777215)
	private byte[] byteArray;
}
