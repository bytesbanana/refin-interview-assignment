package com.bytesbanana.refinnassignmentbackend.web.mapper;

import com.bytesbanana.refinnassignmentbackend.domain.Asset;
import com.bytesbanana.refinnassignmentbackend.model.AssetDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AssetMapper {

    AssetMapper INSTANCE = Mappers.getMapper(AssetMapper.class);

    Asset assetDtoToAsset(AssetDTO assetDTO);

}
