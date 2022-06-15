package com.cantaur.adminlte.service;

import com.cantaur.adminlte.model.board.BbsContents;
import com.cantaur.adminlte.model.board.BbsContentsReq;
import com.cantaur.adminlte.model.board.BbsInfo;
import com.cantaur.adminlte.model.board.BbsInfoReq;

import java.util.List;

public interface BoardService {
    int selectCount(BbsContentsReq bbsContentsReq);

    List<BbsContents> selectAllBbsContents(BbsContentsReq bbsContentsReq);

    List<BbsInfo> selectBbsInfoList(BbsInfoReq bbsInfoReq);
}
