package com.example.cosmetic.controller;

import com.example.cosmetic.dto.StoreDto;
import lombok.RequiredArgsConstructor;
import com.example.cosmetic.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@Slf4j
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;
    @PostMapping(value = "/createStore")
    public ModelAndView createStore(ModelAndView mv, String name, String location){
        log.info("ManageController > createCos 사용자 등록 요청 시작");

        mv.addObject("resultStore", storeService.createStore(name, location));
        mv.setViewName("resultStore.html");
        return mv;
    }
    @GetMapping(value = "/store")
    public ModelAndView requestStore(ModelAndView mv){
        log.info("CosController > requestStore 매장 등록 페이지 이동 중 요청");
        mv.setViewName("requestStore.html");
        return mv;
    }
    @RequestMapping(value = "/findStore" , method = RequestMethod.GET)
    public ModelAndView findStore(ModelAndView mv, Long s_seq){
        StoreDto storeDto = storeService.findStore(s_seq);
        log.info("해당 매장 매장명, 매장 위치 조회 완료!");
        mv.addObject("name", storeDto.getName());
        mv.addObject("location", storeDto.getLocation());
        mv.setViewName("findStore.html");
        return mv;
    }
    @GetMapping(value="findStoreAll")
    public ModelAndView findCosAll(ModelAndView mv){
        log.info("CosController > findCosAll 사용자 리스트 요청 시작!!");
        mv.addObject("storeList", storeService.findCosAll());
        mv.setViewName("StoreTable.html");
        return mv;
    }
}
