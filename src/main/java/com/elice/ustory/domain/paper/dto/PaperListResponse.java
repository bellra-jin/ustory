package com.elice.ustory.domain.paper.dto;

import com.elice.ustory.domain.paper.entity.Paper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class PaperListResponse {

    @Schema(description = "타이틀", example = "우규 갔다 왔어요.")
    private String title;

    @Schema(description = "썸네일 이미지", example = "https://~~~~~~")
    private String thumbnailImageUrl;

    @Schema(description = "다이어리 이름", example = "꽁냥껑냥")
    private String diaryName;

    @Schema(description = "상호명", example = "우규")
    private String store;

    @Schema(description = "paper Id", example = "12345678")
    private Long paperId;

    public PaperListResponse(Paper paper) {
        this.title = paper.getTitle();
        this.thumbnailImageUrl = paper.getThumbnailImageUrl();
        this.diaryName = paper.getDiary().getName();
        this.store = paper.getAddress().getStore();
        this.paperId = paper.getId();
    }
}
