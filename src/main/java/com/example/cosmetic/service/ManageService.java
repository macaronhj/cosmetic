package com.example.cosmetic.service;

import com.example.cosmetic.dto.RegisterDto;
import com.example.cosmetic.mapper.CosMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ManageService {
    private final CosMapper cosMapper;
    public String createCos(String name, String company ,Long sale){
        int result = cosMapper.createCos(name, company, sale);
        String registerResult = "화장품 등록 실패";

        if(result > 0){
            registerResult = "화장품 등록 성공";
            log.info("ManageService > registerCos 화장품 등록 요청 성공");
        }
        return registerResult;
    }
    public String registerUser(RegisterDto registerDto) {
        // 사용자 정보 insert
        int result = cosMapper.registerCos(registerDto);
        String registerResult = "회원 등록 실패";

        if (result > 0) {
            registerResult = "회원 등록 성공";
            log.info("[ ManageService > registerUser 사용자 등록 요청 성공]");
        }

        return registerResult;
    }
}
