package com.cantaur.adminlte.service.impl;

import com.cantaur.adminlte.mapper.board.BbsContentsMapper;
import com.cantaur.adminlte.model.board.BbsContents;
import com.cantaur.adminlte.model.board.BbsContentsReq;
import com.cantaur.adminlte.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BoardServiceImpl implements BoardService {

    private BbsContentsMapper bbsContentsMapper;

    public BoardServiceImpl(BbsContentsMapper bbsContentsMapper){
        this.bbsContentsMapper = bbsContentsMapper;

    }

    @Override
    public int selectCount(BbsContentsReq bbsContentsReq){
        return bbsContentsMapper.countTotalBbsContents(bbsContentsReq);
    }

    @Override
    public List<BbsContents> selectAllBbsContents(BbsContentsReq bbsContentsReq){
        return bbsContentsMapper.selectAllBbsContents(bbsContentsReq);
    }

}
