package com.gft.helloworld.service;

import org.osgi.service.component.annotations.Component;

import com.gft.helloworld.api.HelloDictionary;

@Component(service=HelloDictionary.class)
public class DictionaryImpl implements HelloDictionary {

	@Override
	public String sayHi() {
		return "Sabai dee mai?";
	}
	
	
}