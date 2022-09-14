package com.bytesbanana.refinnassignmentbackend.respository;

import com.bytesbanana.refinnassignmentbackend.domain.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long> {
}
