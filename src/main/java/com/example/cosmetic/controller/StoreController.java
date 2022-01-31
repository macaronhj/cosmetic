package com.example.cosmetic.controller;

import lombok.RequiredArgsConstructor;
import com.example.cosmetic.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
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
}
