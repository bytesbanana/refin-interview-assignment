package com.bytesbanana.refinnassignmentbackend.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/assets")
public class AssetController {

    @PostMapping
    public ResponseEntity<?> createNewAsset() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }


    @GetMapping("/{assetId}")
    public ResponseEntity<?> getAsset(@PathVariable Long assetId) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @GetMapping
    public ResponseEntity<?> getAssets() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PutMapping("/{assetId}")
    public ResponseEntity<?> updateAsset(@PathVariable Long assetId) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @DeleteMapping("/{assetId}")
    public ResponseEntity<?> deleteAsset(@PathVariable Long assetId) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }







}
