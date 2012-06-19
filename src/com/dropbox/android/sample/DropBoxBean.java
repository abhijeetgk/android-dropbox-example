package com.dropbox.android.sample;

import java.io.Serializable;

public class DropBoxBean implements Serializable
{
	private static final long serialVersionUID = -1354406198436498412L;
	
	private String fileName,publicURL;
	
	public DropBoxBean(String fName,String url)
	{
		setFileName(fName);
		setPublicURL(url);
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public String getPublicURL()
	{
		return publicURL;
	}

	public void setPublicURL(String publicURL)
	{
		this.publicURL = publicURL;
	}
}