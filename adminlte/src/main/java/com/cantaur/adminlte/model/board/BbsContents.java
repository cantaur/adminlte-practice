package com.cantaur.adminlte.model.board;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BbsContents {


    private String siteCd;
    private Integer bbsId;
    private Integer seqNo;

    private Integer bbsNo;
    private Integer depthNo;
    private Integer orderNo;
    private Integer parentNo;


    private String editorType;
    private String contentsType;

    private String subject;
    private String keyword;
    private String contents;



    private String rfileNm1;
    private String sfileNm1;
    private String filePath1;
    private Integer fileSize1;
    private String rfileNm2;
    private String sfileNm2;
    private String filePath2;
    private Integer fileSize2;
    private String rfileNm3;
    private String sfileNm3;
    private String filePath3;
    private Integer fileSize3;

    private Integer hitCount;
    private String creator;
    private String creatorNm;
    private String creatorEmail;
    private String creatorPasswd;

    private LocalDateTime crdt;
    private String updater;
    private LocalDateTime updt;
    private String tempImg;
    private Boolean commentYn;
    private Boolean secretYn;


}
