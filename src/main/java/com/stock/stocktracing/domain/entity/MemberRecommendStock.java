package com.stock.stocktracing.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity(name = "MemberRecommendStock")
public class MemberRecommendStock extends BaseTimeEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long memberStockId;

	@Column
	private Long weekDay;

	@Column
	private String memberName;

	@Column
	private String stockName;

	@Column
	private Long stockCode;

	@Column
	private String comment;

	@Builder
	public MemberRecommendStock(Long weekDay, String memberName, String stockName, Long stockCode, String comment) {
		this.weekDay = weekDay;
		this.memberName = memberName;
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.comment = comment;
	}

}
