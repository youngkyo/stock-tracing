package com.stock.stocktracing.domain.repository;

import com.stock.stocktracing.domain.entity.MemberRecommendStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface MemberRecommendRepository extends JpaRepository<MemberRecommendStock, Long> {
	@Query("SELECT stock " +
		"FROM MemberRecommendStock stock " +
		"ORDER BY stock.id DESC")
	Stream<MemberRecommendStock> findAllDesc();
}
