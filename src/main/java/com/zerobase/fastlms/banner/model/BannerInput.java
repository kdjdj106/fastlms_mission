package com.zerobase.fastlms.banner.model;


import lombok.Data;

@Data
public class BannerInput {
    long id;
    String subject;
    String linkAddress;
    long sortValue;
    boolean openMethod;
    boolean usingYn;

    //삭제를 위한
    String idList;

    //ADD
    String filename;
    String urlFilename;
}
