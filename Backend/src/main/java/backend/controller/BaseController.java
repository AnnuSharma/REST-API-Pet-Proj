package backend.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.resource.ProjectResource;

@RestController
public class BaseController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/project")
	public ProjectResource postResource(@RequestParam(value = "name", defaultValue = "defaultName") String name){
		return new ProjectResource(counter.incrementAndGet(), name);
	}
}
