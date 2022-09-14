package com.bytesbanana.refinnassignmentbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AssetDTO {

    private Long id;
    private String title;
    private String description;
    private Double latitude;
    private Double longitude;
    private String picture;

}
