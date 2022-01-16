package com.org.w;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.org.w.MvcConfig;

public class MyFrountController extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
// TODO Auto-generated method stub
		return new Class[] { MvcConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
// TODO Auto-generated method stub
		return new String[] { "/" };
	}

}