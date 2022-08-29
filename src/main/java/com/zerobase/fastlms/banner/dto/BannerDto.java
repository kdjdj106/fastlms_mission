package com.zerobase.fastlms.banner.dto;

import com.zerobase.fastlms.banner.entity.Banner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BannerDto {


    Long id;

    String imagePath;
    String subject;

    String linkAddress;
    boolean openMethod;
    long sortValue;
    boolean usingYn;

    LocalDateTime regDt;
    LocalDateTime udtDt;

    String filename;
    String urlFilename;

    //추가컬럼
    long totalCount;
    long seq;

    public static BannerDto of(Banner banner) {

        return BannerDto.builder()
                .id(banner.getId())
                .imagePath(banner.getImagePath())
                .subject(banner.getSubject())
                .linkAddress(banner.getLinkAddress())
                .openMethod(banner.isOpenMethod())
                .sortValue(banner.getSortValue())
                .usingYn(banner.isUsingYn())
                .regDt(banner.getRegDt())
                .udtDt(banner.getUdtDt())
                .filename(banner.getFilename())
                .urlFilename(banner.getUrlFilename())
                .build();

    }
}
