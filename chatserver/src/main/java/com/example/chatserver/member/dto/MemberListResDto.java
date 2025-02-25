package com.example.chatserver.member.dto;

import com.example.chatserver.member.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberListResDto {
    private Long id;
    private String name;
    private String email;

    public static MemberListResDto from(Member member) {
        MemberListResDto memberListResDto = new MemberListResDto();
        memberListResDto.id = member.getId();
        memberListResDto.name = member.getName();
        memberListResDto.email = member.getEmail();
        return memberListResDto;
    }
}
