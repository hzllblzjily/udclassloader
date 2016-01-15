package com.hongbao.udclassloader;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException
    {
    	//System.out.println(App.class.getClassLoader().getResource("entityconstruction.jar").getPath());
    	String jarPathString = System.getProperty("entityjar");
    	File f = new File(jarPathString);
    	URI uri = f.toURI();
        URL url = uri.toURL();
        System.out.println("url = " + url.getPath());
        ClassLoader loader = App.class.getClassLoader();
        URLClassLoader pluginLoader = new CustomClassLoader(new URL[] {url},Thread.currentThread().getContextClassLoader());
        Class<?>class1 = pluginLoader.loadClass("com.hongbao.entitycontruction.Child");
        class1.newInstance();
    }
}
