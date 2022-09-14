package com.bytesbanana.refinnassignmentbackend.respository;

import com.bytesbanana.refinnassignmentbackend.domain.Asset;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class AssetRepositoryTest {

    @Autowired
    private AssetRepository assetRepository;


    @AfterEach
    void tearDown(){
        assetRepository.deleteAll();
    }

    @Test
    void itShouldSaveNewAsset() {
        //given
        Asset asset = Asset.builder()
                .title("Test title")
                .description("Test description")
                .picture("Test picture")
                .latitude(123.123)
                .longitude(123.123)
                .build();
        //when
        Asset savedResult = assetRepository.save(asset);

        //then
        assertThat(savedResult.getId()).isNotNull();
    }

}