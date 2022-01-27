package com.example.cosmetic.controller;

import com.example.cosmetic.dto.CosmeticDto;
import com.example.cosmetic.service.CosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequiredArgsConstructor
public class CosController {

    private final CosService cosService;

    @RequestMapping(value = "/list" , method = RequestMethod.GET)

    public ModelAndView list(ModelAndView mv, Long seq){
        CosmeticDto cosDto = cosService.findCos(seq);
        log.info("로그으으으");
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
}
