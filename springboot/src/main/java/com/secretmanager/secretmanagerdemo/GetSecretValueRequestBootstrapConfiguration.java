package com.secretmanager.secretmanagerdemo;

import org.springframework.boot.BootstrapRegistry;
import org.springframework.boot.BootstrapRegistryInitializer;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;

public class GetSecretValueRequestBootstrapConfiguration implements BootstrapRegistryInitializer {
    @Override
    public void initialize(BootstrapRegistry registry) {
        registry.register(GetSecretValueRequest.class, context -> {
            return GetSecretValueRequest.builder()
                    .versionStage("0.0.11111")
                    .build();
        });
    }
}
