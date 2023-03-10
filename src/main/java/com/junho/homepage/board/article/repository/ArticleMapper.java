package com.junho.homepage.board.article.repository;

import com.junho.homepage.board.article.Article;
import com.junho.homepage.board.article.dto.response.ArticleResponse;
import com.junho.homepage.member.Member;
import com.junho.homepage.member.dto.response.MemberResponse;
import com.junho.homepage.member.repository.MemberMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ArticleMapper {

    ArticleMapper INSTANCE = Mappers.getMapper(ArticleMapper.class);

    @Mapping(source = "creator", target = "creator", qualifiedByName = "parseMember")
    @Mapping(source = "modifier", target = "modifier", qualifiedByName = "parseMember")
    ArticleResponse toArticleResponse(Article entity);

    @Named("parseMember")
    default MemberResponse parseMember(Member entity) {
        return MemberMapper.INSTANCE.toMemberResponse(entity);
    }
}
