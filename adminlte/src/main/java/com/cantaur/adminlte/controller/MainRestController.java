package com.cantaur.adminlte.controller;

import com.cantaur.adminlte.model.board.BbsContents;
import com.cantaur.adminlte.model.board.BbsContentsReq;
import com.cantaur.adminlte.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class MainRestController {
    private BoardService boardService;

    public MainRestController(BoardService boardService){
        this.boardService = boardService;
    }

    /**
     * DataTables 클라이언트 사이드 렌더링
     * @param bbsContentsReq
     * @throws Exception
     */
    @GetMapping("/bbs/contents/client")
    public List<BbsContents> selectBbsContentsByClientSide(
            @ModelAttribute("search") BbsContentsReq bbsContentsReq
    ) throws Exception{
        return boardService.selectAllBbsContents(bbsContentsReq);
    }


}
