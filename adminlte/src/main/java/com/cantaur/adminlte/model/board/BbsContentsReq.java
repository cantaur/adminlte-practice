package com.cantaur.adminlte.model.board;


import com.cantaur.adminlte.model.Pagination;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BbsContentsReq extends Pagination {
    private String siteCd = "3";
    private Integer bbsId = 27;
    private String searchType;
    private String searchValue;
    private String testType = "data-tables";
}
