package com.bytesbanana.refinnassignmentbackend.service;

import com.bytesbanana.refinnassignmentbackend.domain.Asset;
import com.bytesbanana.refinnassignmentbackend.model.AssetDTO;
import com.bytesbanana.refinnassignmentbackend.respository.AssetRepository;
import com.bytesbanana.refinnassignmentbackend.web.mapper.AssetMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;


class AssetServiceTest {

    @Mock
    private AssetRepository assetRepository;
    private AutoCloseable autoClosable;
    private AssetService assetService;

    @BeforeEach
    void setUp() {
        autoClosable = MockitoAnnotations.openMocks(this);
        assetService = new AssetService(assetRepository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoClosable.close();
    }


    @Test
    void shouldSaveNewAsset() {
        AssetDTO assetDTO = AssetDTO.builder()
                .id(null)
                .title("New Asset")
                .description("Test description")
                .latitude(123.123)
                .longitude(123.123)
                .picture("Test pic")
                .build();

        Asset expected = AssetMapper.INSTANCE.assetDtoToAsset(assetDTO);
        expected.setId(1L);
        doReturn(expected).when(assetRepository).save(any(Asset.class));
        assertThat(assetService.addAsset(assetDTO)).isEqualTo(expected);
    }

}