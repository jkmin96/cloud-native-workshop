package com.github.jkmin96.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/jk", produces = MediaType.APPLICATION_JSON_VALUE)
public class EnvResource {
	
	@Autowired
	private Environment environment;
	
	@RequestMapping(value = "/get-env", method = RequestMethod.GET)
	public String getEnv(@RequestParam String env) {
	    return "Env" + " " + environment.getProperty(env);
	}
}
