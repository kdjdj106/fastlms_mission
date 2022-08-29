package com.zerobase.fastlms.banner.service;

import com.zerobase.fastlms.banner.dto.BannerDto;
import com.zerobase.fastlms.banner.model.BannerInput;
import com.zerobase.fastlms.banner.model.BannerParam;

import java.util.List;

public interface BannerService {


    //배너 등록
    boolean add(BannerInput parameter);

    //배너 목록
    List<BannerDto> list(BannerParam parameter);



    BannerDto getById(long id);

    boolean set(BannerInput parameter);

    boolean del(String idList);

    List<BannerDto> usingBannerList(BannerParam parameter);
}
