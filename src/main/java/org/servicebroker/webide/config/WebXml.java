package org.servicebroker.webide.config;

import org.servicebroker.webide.Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * WebXml 설정 클래스
 *
 * @author sjchoi
 * @since 2018.08.21
 * @version 1.0
 */
public class WebXml extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

}