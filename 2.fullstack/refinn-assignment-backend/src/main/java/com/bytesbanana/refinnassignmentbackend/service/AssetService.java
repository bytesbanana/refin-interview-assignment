package com.bytesbanana.refinnassignmentbackend.service;

import com.bytesbanana.refinnassignmentbackend.domain.Asset;
import com.bytesbanana.refinnassignmentbackend.model.AssetDTO;
import com.bytesbanana.refinnassignmentbackend.respository.AssetRepository;
import com.bytesbanana.refinnassignmentbackend.web.mapper.AssetMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssetService {
    private final AssetRepository assetRepository;


    public Asset addAsset(AssetDTO assetDTO) {
        Asset newAsset = AssetMapper.INSTANCE.assetDtoToAsset(assetDTO);
        return assetRepository.save(newAsset);
    }


}
