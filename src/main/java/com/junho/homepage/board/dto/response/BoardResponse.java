package com.junho.homepage.board.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.junho.homepage.member.dto.response.MemberResponse;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BoardResponse {

    @ApiModelProperty(notes = "고유 id", example = "10")
    private Long id;

    @ApiModelProperty(notes = "게시판 제목", example = "최준호의 게시글입니다.")
    private String title;

    @ApiModelProperty(notes = "게시판 내용", example = "게시글의 내용입니다.")
    private String description;

    @ApiModelProperty(notes = "작성자")
    private MemberResponse creator;

    @ApiModelProperty(notes = "수정자")
    private MemberResponse modifier;

    @ApiModelProperty(notes = "생성일자", example = "2020.12.15 12:11")
    private LocalDateTime createDate;

    @ApiModelProperty(notes = "수정일자", example = "2020.12.15 12:11")
    private LocalDateTime updateDate;
}
