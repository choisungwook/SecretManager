package com.secretmanager.secretmanagerdemo;

import org.springframework.boot.BootstrapRegistry;
import org.springframework.boot.BootstrapRegistryInitializer;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;

public class SecretsManagerBootstrapConfiguration implements BootstrapRegistryInitializer {
    @Override
    public void initialize(BootstrapRegistry registry) {
        registry.register(SecretsManagerClient.class, context -> {
            AwsCredentialsProvider awsCredentialsProvider = StaticCredentialsProvider.create(
                    AwsBasicCredentials.create("yourAccessKey", "yourSecretKey")
            );

            return SecretsManagerClient.builder()
                    .credentialsProvider(awsCredentialsProvider)
                    .region(Region.EU_WEST_2)
                    .build();
        });
    }
}
