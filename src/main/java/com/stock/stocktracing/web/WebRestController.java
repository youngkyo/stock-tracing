package com.stock.stocktracing.web;

import com.stock.stocktracing.domain.dto.PostsSaveRequestDto;
import com.stock.stocktracing.domain.repository.PostsRepository;
import com.stock.stocktracing.domain.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

	@Autowired
	private PostsRepository repository;

	@Autowired
	private PostsService service;

	@GetMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}

	@PostMapping("/posts")
	public void savePosts(@RequestBody PostsSaveRequestDto dto) {
		service.save(dto);
	}
}