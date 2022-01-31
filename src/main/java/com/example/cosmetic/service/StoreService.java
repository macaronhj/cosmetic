package com.example.cosmetic.service;

import com.example.cosmetic.dto.StoreDto;
import com.example.cosmetic.mapper.StoreMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StoreService {
    private final StoreMapper storeMapper;

    public String createStore(String name, String location){
        int resultStore = storeMapper.createStore(name, location);
        String registerResultS = "매장 등록 실패";

        if(resultStore > 0){
            registerResultS = "매장 등록 완료!!!";
            log.info("StoreeService > registerStore 매장 등록 요청 성공");
        }
        return registerResultS;
    }
    public List<StoreDto> findCosAll() {
        return storeMapper.findCosAll();
    }
}

