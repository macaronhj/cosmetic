package com.example.cosmetic.boarder.service;

import com.example.cosmetic.boarder.dto.BoarderDto;
import com.example.cosmetic.boarder.mapper.BoarderMapper;
import com.example.cosmetic.dto.CosmeticDto;
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

    public List<BoarderDto> registerRequest(String name, int count, String company ,Long sale) {
        int result = boarderMapper.registerRequest(name, count, company, sale);
        String registerResult = "화장품 등록 실패";

        if (result > 0) {
            registerResult = "화장품 등록 완료!!!";
            log.info("ManageService > registerCos 화장품 등록 요청 성공");
        }
        return boarderMapper.boarder();
    }
    public List<BoarderDto> delete(Long seq){
        int result = boarderMapper.delete(seq);
        String registerResult = "delete fail";

        if(result>0){
            registerResult = "delete success";
            log.info("[BoarderService > deleteUser 사용자 삭제 요청 성공]");
        }
        return boarderMapper.boarder();
    }
    public BoarderDto update1(Long seq){
        return boarderMapper.update1(seq);
    }
    public int update2(Long seq){
        int result = boarderMapper.update2(seq);
        String registerResultU = "update fail";

        if(result>0){
            registerResultU = "update success";
            log.info("[BoarderService > updateUser 사용자 수정 요청 성공]");
        }
        return boarderMapper.update2(seq);
    }
}
