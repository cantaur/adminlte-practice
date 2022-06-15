package com.cantaur.adminlte.service;

import com.cantaur.adminlte.model.board.BbsContents;
import com.cantaur.adminlte.model.board.BbsContentsReq;

import java.util.List;

public interface BoardService {
    int selectCount(BbsContentsReq bbsContentsReq);

    List<BbsContents> selectAllBbsContents(BbsContentsReq bbsContentsReq);
}
