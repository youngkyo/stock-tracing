package com.stock.stocktracing.web;

import com.stock.stocktracing.domain.service.MemberRecommendStockService;
import com.stock.stocktracing.domain.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

	private PostsService postsService;

	private MemberRecommendStockService recommendStockService;

	@GetMapping("/")
	public String main(Model model) {
		return "hello";
	}

	@GetMapping("/stock")
	public String stockAdd(Model model) {
//		model.addAttribute("posts", postsService.findAllDesc());
		model.addAttribute("posts", recommendStockService.findAllDesc());
		return "stock/imagine";
	}
}
