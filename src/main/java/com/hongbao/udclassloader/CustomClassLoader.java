/**
 * 
 */
package com.hongbao.udclassloader;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author hzllb
 *
 * 2016年1月15日
 */
public class CustomClassLoader extends URLClassLoader {

	/**
	 * @param urls
	 */
	public CustomClassLoader(URL[] urls) {
		super(urls);
	}
	
	public CustomClassLoader(URL[] urls,ClassLoader parent) {
		super(urls,parent);
	}

}
