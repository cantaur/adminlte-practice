package com.cantaur.adminlte.model.board;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BbsInfo {
    private String siteCd;
    private Integer bbsId;
    private String bbsNm;
    private String bbsType;
    private Integer flagLine;
    private Integer bbsLine;
    private Integer flagPage;
    private String managerId;
    private Boolean authorityYn;
    private Boolean fileUseYn;
    private Integer fileCount;
    private Integer fileSize;
    private Boolean useYn;
    private Boolean editorYn;
    private Boolean loginChkYn;
    private String bbsComment;
    private Integer newarticleDay;
    private Integer recommendCount;
    private Boolean badwordUseYn;
    private String badword;
    private String subjectLength;
    private String mailToMaster;
    private String mailToManager;
    private String mailToUser;
    private Boolean commentUseYn;
    private Boolean emoticonUseYn;
    private Boolean threadViewYn;
    private Boolean prevNextViewYn;
    private Boolean categoryYn;
    private Boolean secretYn;
    private Boolean emailYn;
    private Boolean creatorYn;
    private Boolean creatorIpYn;
    private Boolean bbsPointYn;
    private String creator;
    private LocalDateTime crdt;
    private String updater;
    private LocalDateTime updt;
    private String bbsExplain;
    private Boolean basic;
    private Boolean lifeOpenYn;
    private Integer orderSeq;

}
