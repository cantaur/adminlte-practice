package com.cantaur.adminlte.mapper.board;

import com.cantaur.adminlte.model.board.BbsInfo;
import com.cantaur.adminlte.model.board.BbsInfoReq;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BbsInfoMapper {
    List<BbsInfo> selectBbsInfoList(BbsInfoReq bbsInfoReq) throws DataAccessException;
}
