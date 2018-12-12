package com.gft.helloworld;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;

import com.gft.helloworld.api.HelloDictionary;

@Component
public class Hello {
	@Reference(policy=ReferencePolicy.DYNAMIC)
	public void setDictionary(HelloDictionary dict) {
		System.out.println("Setting Dictionary: " + dict.sayHi());
	}
	
	public void unsetDictionary(HelloDictionary dict) {
		System.out.println("Unsetting Dictionary: " + dict.sayHi());
	}
}