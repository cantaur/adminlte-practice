package com.cantaur.adminlte.controller;

import com.cantaur.adminlte.model.board.BbsInfo;
import com.cantaur.adminlte.model.board.BbsInfoReq;
import com.cantaur.adminlte.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    private BoardService boardService;

    public MainController(BoardService boardService){
        this.boardService = boardService;
    }


    @GetMapping("/")
    public String main(BbsInfoReq bbsInfoReq){
        List<BbsInfo> bbsInfoList = boardService.selectBbsInfoList(bbsInfoReq);
        return "home";
    }

    /**
     * data table 연습 - client side
     * @param model
     * @throws Exception
     */
    @GetMapping(value = "/table/client")
    public String selectTableByClient(Model model) {
        model.addAttribute("type", "CLIENT SIDE RENDERING");
        return "/tables/client";
    }


    @GetMapping("/admin/board/info")
    public ModelAndView boardInfo(BbsInfoReq bbsInfoReq){
        ModelAndView mv = new ModelAndView();
        List<BbsInfo> bbsInfoList = boardService.selectBbsInfoList(bbsInfoReq);
        mv.setViewName("admin/board/info");
        return mv;
    }



}
