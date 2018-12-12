package com.gft.example.dynamic.config;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.log.LogService;

@Component(configurationPid="hello.cfg")
public class DynamicConfig {
	private LogService logger;

	@Reference
	public void setLogger(LogService logger) {
		this.logger = logger;
	}
 	
	@Activate
	public void activate(Map<String, Object> properties) {
		logger.log(LogService.LOG_INFO, "activate: " + properties.get("say.hello"));
	}
	
	@Modified
	public void modified(Map<String, Object> properties) {
		logger.log(LogService.LOG_INFO, "modified: " + properties.get("say.hello"));
	}
}