package com.junho.homepage.board.article.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateArticle {

    @ApiModelProperty(notes = "게시판 아이디", example = "1")
    private Long boardId;

    @ApiModelProperty(notes = "게시물 제목", example = "최준호의 게시글입니다.")
    private String title;

    @ApiModelProperty(notes = "게시물 내용", example = "게시글의 내용입니다.")
    private String description;
}
