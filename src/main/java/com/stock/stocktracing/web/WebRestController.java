package com.stock.stocktracing.web;

import com.stock.stocktracing.domain.dto.MemberRecommendStockDto;
import com.stock.stocktracing.domain.dto.PostsSaveRequestDto;
import com.stock.stocktracing.domain.service.MemberRecommendStockService;
import com.stock.stocktracing.domain.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class WebRestController {


	@Autowired
	private PostsService service;

	@Autowired
	private MemberRecommendStockService memberRecommendStockService;

	@GetMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}

	@PostMapping("/posts")
	public void savePosts(@RequestBody PostsSaveRequestDto dto) {
		service.save(dto);
	}

	@PostMapping("/stock/Register")
	public void saveMemberRecommendStock(@RequestBody MemberRecommendStockDto recommendStockDto) {
		memberRecommendStockService.save(recommendStockDto);
	}
}