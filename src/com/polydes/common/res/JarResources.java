package com.polydes.common.res;

import java.io.InputStream;
import java.net.URL;

public class JarResources extends Resources
{
	private final ClassLoader cl;
	private final String rootPath;
	
	JarResources(String packageName, String packageNameAsPath)
	{
		super(packageName);
		
		cl = getClass().getClassLoader();
		
		rootPath = packageNameAsPath;
	}
	
	@Override
	public URL getUrl(String name)
	{
		return cl.getResource(rootPath + name);
	}
	
	@Override
	public InputStream getUrlStream(String name)
	{
		return cl.getResourceAsStream(rootPath + name);
	}
}
