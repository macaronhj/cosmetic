package com.example.cosmetic.boarder.service;

import com.example.cosmetic.boarder.dto.BoarderDto;
import com.example.cosmetic.boarder.mapper.BoarderMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class BoarderService {
    private final BoarderMapper boarderMapper;
    public List<BoarderDto> boarder() {
        return boarderMapper.boarder();
    }
    public String registerRequest(String name, int count, String company ,Long sale) {
        int result = boarderMapper.registerRequest(name, count, company, sale);
        String registerResult = "화장품 등록 실패";

        if (result > 0) {
            registerResult = "화장품 등록 완료!!!";
            log.info("ManageService > registerCos 화장품 등록 요청 성공");
        }
        return registerResult;
    }
}
