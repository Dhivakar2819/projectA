package com.chainsys.springproject.startup;

import com.chainsys.springproject.beans.TestCar;
import com.chainsys.springproject.test.TestAnnotationConfig;
import com.chainsys.springproject.test.TestClasspathXml;
import com.chainsys.springproject.test.TestXmlBeanFactory;
public class Main {

	public static void main(String[] args) {
		TestClasspathXml.testAutowire();
	}
	
}

