package io.shaunthomas.storage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestPropertySource(properties = {
    "AZURE_STORAGE_ACCOUNT_NAME = test",
    "AZURE_STORAGE_ACCOUNT_ENDPOINT = https://shaunthomas.io"
  })
class MyAzureStorageAccountGithubSpringBootSampleApplicationTests {

  @Test
  void contextLoads() {
    assertTrue(true);
  }
}
