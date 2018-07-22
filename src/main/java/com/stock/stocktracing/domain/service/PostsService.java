package com.stock.stocktracing.domain.service;

import com.stock.stocktracing.domain.dto.PostsMainResponseDto;
import com.stock.stocktracing.domain.dto.PostsSaveRequestDto;
import com.stock.stocktracing.domain.repository.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostsService {
	private PostsRepository postsRepository;

	@Transactional
	public Long save(PostsSaveRequestDto dto){
		return postsRepository.save(dto.toEntity()).getId();
	}

	@Transactional
	public List<PostsMainResponseDto> findAllDesc() {
		return postsRepository.findAllDesc().map(PostsMainResponseDto::new).collect(Collectors.toList());
	}

	public void getStockInfo() {
		String html = "http://kind.krx.co.kr/corpgeneral/corpList.do?method=download&searchType=13";
		try {
			URL url = new URL("http://kind.krx.co.kr/corpgeneral/corpList.do?method=download&searchType=13");
			URLConnection connection = url.openConnection();
			InputStreamReader input = new InputStreamReader(connection.getInputStream());
			BufferedReader in = new BufferedReader(input);

			String inputLine;

//			FileWriter = outFile

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
