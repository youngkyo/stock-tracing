package com.stock.stocktracing.domain.service;

import com.stock.stocktracing.domain.dto.PostsSaveRequestDto;
import com.stock.stocktracing.domain.repository.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class PostsService {
	private PostsRepository postsRepository;

	@Transactional
	public Long save(PostsSaveRequestDto dto){
		return postsRepository.save(dto.toEntity()).getId();
	}
}
