package com.zerobase.fastlms.admin.dto;

import com.zerobase.fastlms.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MemberLoginHistoryDto {

    long id;
    String userId;
    LocalDateTime recentLogInDt;
    String userIP;
    String userAgent;
    
    
//    public static MemberLoginHistoryDto of(Member member) {
//
//        return MemberLoginHistoryDto.builder()
//                .userId(member.getUserId())
//                .userName(member.getUserName())
//                .phone(member.getPhone())
//                //.password(member.getPassword())
//                .regDt(member.getRegDt())
//                .udtDt(member.getUdtDt())
//                .emailAuthYn(member.isEmailAuthYn())
//                .emailAuthDt(member.getEmailAuthDt())
//                .emailAuthKey(member.getEmailAuthKey())
//                .resetPasswordKey(member.getResetPasswordKey())
//                .resetPasswordLimitDt(member.getResetPasswordLimitDt())
//                .adminYn(member.isAdminYn())
//                .userStatus(member.getUserStatus())
//
//                .zipcode(member.getZipcode())
//                .addr(member.getAddr())
//                .addrDetail(member.getAddrDetail())
//
////                .recentLogInDt(member.getRecentLogInDt())
//
//                .build();
//    }
//
//
//    public String getRegDtText() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
//        return regDt != null ? regDt.format(formatter) : "";
//    }
//
//    public String getUdtDtText() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
//        return udtDt != null ? udtDt.format(formatter) : "";
//
//    }
    
}
