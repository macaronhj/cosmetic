package com.example.cosmetic.controller;

import com.example.cosmetic.dto.CosmeticDto;
import com.example.cosmetic.dto.StoreDto;
import com.example.cosmetic.service.CosService;
import com.example.cosmetic.service.StoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequiredArgsConstructor
public class CosController {

    private final CosService cosService;

    @RequestMapping(value = "/findCos" , method = RequestMethod.GET)
    public ModelAndView list(ModelAndView mv, Long seq){
        CosmeticDto cosDto = cosService.findCos(seq);
        log.info("해당 화장품 상품명, 가격 조회 완료!");
        mv.addObject("name", cosDto.getName());
        mv.addObject("sale", cosDto.getSale());
        mv.setViewName("findcos.html");
        return mv;
    }
    @RequestMapping(value = "/PostDemo" , method = RequestMethod.POST)
    public ModelAndView postDemo(ModelAndView mv, String id){

        mv.addObject("msg", "post 전송 성공");
        mv.setViewName("test3.html");
        return mv;
    }
    @GetMapping(value = "/")
    public ModelAndView requestPage(ModelAndView mv){
        log.info("CosController > requestPage 화장품 등록 페이지 이동 중 요청");
        mv.setViewName("request.html");
        return mv;
    }
    @GetMapping(value="findAll")
    public ModelAndView findAll(ModelAndView mv) {
        log.info("CosController > findAll 사용자 리스트 요청 시작!!");
        mv.addObject("cosList", cosService.findAll());
        mv.setViewName("resultTable.html");
        return mv;
    }
}
