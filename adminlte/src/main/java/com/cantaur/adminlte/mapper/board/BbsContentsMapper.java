package com.cantaur.adminlte.mapper.board;

import com.cantaur.adminlte.model.board.BbsContents;
import com.cantaur.adminlte.model.board.BbsContentsReq;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BbsContentsMapper {
    int countTotalBbsContents(BbsContentsReq bbsContentsReq) throws DataAccessException;
    int countBbsContents(BbsContentsReq bbsContentsReq) throws DataAccessException;
    List<BbsContents> selectAllBbsContents(BbsContentsReq bbsContentsReq) throws DataAccessException;
    List<BbsContents> selectBbsContentsPageList(BbsContentsReq bbsContentsReq) throws DataAccessException;
}
