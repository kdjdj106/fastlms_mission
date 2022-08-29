package com.zerobase.fastlms.banner.service;

import com.zerobase.fastlms.admin.dto.MemberDto;
import com.zerobase.fastlms.banner.dto.BannerDto;
import com.zerobase.fastlms.banner.entity.Banner;
import com.zerobase.fastlms.banner.mapper.BannerMapper;
import com.zerobase.fastlms.banner.model.BannerInput;
import com.zerobase.fastlms.banner.model.BannerParam;
import com.zerobase.fastlms.banner.repository.BannerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BannerServiceImpl implements BannerService{

    private final BannerRepository bannerRepository;
    private final BannerMapper bannerMapper;

    @Override
    public boolean add(BannerInput parameter) {
        Banner banner = Banner.builder()
                .subject(parameter.getSubject())
                .regDt(LocalDateTime.now())
                .linkAddress(parameter.getLinkAddress())
                .sortValue(parameter.getSortValue())
                .openMethod(parameter.isOpenMethod())
                .usingYn(parameter.isUsingYn())
                .filename(parameter.getFilename())
                .urlFilename(parameter.getUrlFilename())
                .build();

       bannerRepository.save(banner);


        return true;
    }

    @Override
    public List<BannerDto> list(BannerParam parameter) {
        long totalCount = bannerMapper.selectListCount(parameter);

        List<BannerDto> list = bannerMapper.selectList(parameter);
        if (!CollectionUtils.isEmpty(list)) {
            int i = 0;
            for(BannerDto x : list) {
                x.setTotalCount(totalCount);
                x.setSeq(totalCount - parameter.getPageStart() - i);
                i++;
            }
        }

        return list;
    }


    @Override
    public List<BannerDto> usingBannerList(BannerParam parameter) {

        List<BannerDto> list = bannerMapper.selectUsingBannerList(parameter);
        return list;
    }


    @Override
    public BannerDto getById(long id) {

        return bannerRepository.findById(id).map(BannerDto::of).orElse(null);

    }

    @Override
    public boolean set(BannerInput parameter) {

        Optional<Banner> optionalBanner = bannerRepository.findById(parameter.getId());
        if (!optionalBanner.isPresent()){
            return false;
        }
        Banner banner = optionalBanner.get();
        banner.setSubject(parameter.getSubject());
        banner.setLinkAddress(parameter.getLinkAddress());
        banner.setSortValue(parameter.getSortValue());
        banner.setUdtDt(LocalDateTime.now());
        banner.setOpenMethod(parameter.isOpenMethod());
        banner.setUsingYn(parameter.isUsingYn());
        banner.setFilename(parameter.getFilename());
        banner.setUrlFilename(parameter.getUrlFilename());
        bannerRepository.save(banner);
        return true;
    }

    @Override
    public boolean del(String idList) {
        if (idList != null && idList.length() > 0) {
            String[] ids = idList.split(",");
            for (String x : ids) {
                long id = 0L;
                try {
                    id = Long.parseLong(x);
                } catch (Exception e) {
                }

                if (id > 0) {
                    bannerRepository.deleteById(id);
                }
            }
        }

        return true;
    }


}
