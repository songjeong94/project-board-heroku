package com.board.projectboard.dto;

import com.board.projectboard.domain.Hashtag;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public record HashtagDto(

        Long id,

        String hashtagName,

        LocalDateTime createdAt,

        String createdBy,

        LocalDateTime modifiedAt,

        String modifiedBy
) {

    public static  HashtagDto of(String hashtagName) {
        return new HashtagDto(null, hashtagName, null, null, null, null);
    }

    public static HashtagDto of(Long id, String hashtagName, LocalDateTime createdAt, String createdBy, LocalDateTime modifiedAt, String modifiedBy) {
        return new HashtagDto(id, hashtagName, createdAt, createdBy, modifiedAt, modifiedBy);
    }

    public static HashtagDto from(Hashtag entity) {
        return new HashtagDto(
                entity.getId(),
                entity.getHashtagName(),
                entity.getCreatedAt(),
                entity.getCreatedBy(),
                entity.getModifiedAt(),
                entity.getCreatedBy()
        );
    }

    public Hashtag toEntity() { return Hashtag.of(hashtagName); }
}
