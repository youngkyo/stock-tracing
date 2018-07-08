package com.stock.stocktracing.domain.service;

import com.stock.stocktracing.domain.dto.MemberRecommendStockDto;
import com.stock.stocktracing.domain.repository.MemberRecommendRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class MemberRecommendStockService {

	private MemberRecommendRepository recommendRepository;

	@Transactional
	public Long save(MemberRecommendStockDto recommendStockDto) {
		return recommendRepository.save(recommendStockDto.toEntity()).getMemberStockId();
	}

	@Transactional
	public List<MemberRecommendStockDto> findAllDesc() {
		return recommendRepository.findAllDesc().map(MemberRecommendStockDto::new).collect(Collectors.toList());
	}
}
