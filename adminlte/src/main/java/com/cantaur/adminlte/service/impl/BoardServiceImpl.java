package com.cantaur.adminlte.service.impl;

import com.cantaur.adminlte.mapper.board.BbsContentsMapper;
import com.cantaur.adminlte.mapper.board.BbsInfoMapper;
import com.cantaur.adminlte.model.board.BbsContents;
import com.cantaur.adminlte.model.board.BbsContentsReq;
import com.cantaur.adminlte.model.board.BbsInfo;
import com.cantaur.adminlte.model.board.BbsInfoReq;
import com.cantaur.adminlte.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BoardServiceImpl implements BoardService {

    private BbsContentsMapper bbsContentsMapper;
    private BbsInfoMapper bbsInfoMapper;

    public BoardServiceImpl(BbsContentsMapper bbsContentsMapper,
                            BbsInfoMapper bbsInfoMapper){
        this.bbsContentsMapper = bbsContentsMapper;
        this.bbsInfoMapper = bbsInfoMapper;

    }

    @Override
    public int selectCount(BbsContentsReq bbsContentsReq){
        return bbsContentsMapper.countTotalBbsContents(bbsContentsReq);
    }

    @Override
    public List<BbsContents> selectAllBbsContents(BbsContentsReq bbsContentsReq){
        return bbsContentsMapper.selectAllBbsContents(bbsContentsReq);
    }

    @Override
    public List<BbsInfo> selectBbsInfoList(BbsInfoReq bbsInfoReq){
        return bbsInfoMapper.selectBbsInfoList(bbsInfoReq);
    }

}
