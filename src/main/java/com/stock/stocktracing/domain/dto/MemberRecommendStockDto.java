package com.stock.stocktracing.domain.dto;

import com.stock.stocktracing.domain.entity.MemberRecommendStock;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberRecommendStockDto {

	private Long memberStockId;

	private Long weekDay;

	private String memberName;

	private String stockName;

	private Long stockCode;

	private String comment;

	public MemberRecommendStockDto(MemberRecommendStock entity) {
		memberStockId = entity.getMemberStockId();
		memberName = entity.getMemberName();
		stockName = entity.getStockName();
		stockCode = entity.getStockCode();
		comment = entity.getComment();
//		author = entity.getAuthor();
//		modifiedDate = toStringDateTime(entity.getModifiedDate());
	}
//
//	public MemberRecommendStockDto(String memberName, String stockName, String comment) {
//		this.memberName = memberName;
//		this.stockName = stockName;
//		this.comment = comment;
//	}

	public MemberRecommendStockDto(Long weekDay, String memberName, String stockName, Long stockCode,  String comment) {
		this.weekDay = weekDay;
		this.memberName = memberName;
		this.stockName = stockName;
		this.stockCode = stockCode;
		this.comment = comment;
	}

	@Builder
	public MemberRecommendStock toEntity() {
		return MemberRecommendStock.builder()
			.stockName(stockName)
			.memberName(memberName)
			.stockCode(stockCode)
			.comment(comment)
			.build();
	}

}
