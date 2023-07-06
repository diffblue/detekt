package io.gitlab.arturbosch.detekt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class TestConfigDiffblueTest {
  /**
  * Method under test: {@link TestConfig#TestConfig()}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new TestConfig()).getParentPath());
  }

  /**
   * Method under test: {@link TestConfig#TestConfig(Map)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    HashMap<String, Object> values = new HashMap<>();

    // Act
    new TestConfig(values);

    // Assert
    assertTrue(values.isEmpty());
  }

  /**
   * Method under test: {@link TestConfig#getParentPath()}
   */
  @Test
  void testGetParentPath() {
    // Arrange, Act and Assert
    assertNull((new TestConfig()).getParentPath());
  }

  /**
   * Method under test: {@link TestConfig#subConfig(String)}
   */
  @Test
  void testSubConfig() {
    // Arrange
    TestConfig testConfig = new TestConfig();

    // Act and Assert
    assertSame(testConfig, testConfig.subConfig("Key"));
  }

  /**
   * Method under test: {@link TestConfig#valueOrDefault(String, Object)}
   */
  @Test
  void testValueOrDefault() {
    // Arrange, Act and Assert
    assertEquals("Default", (new TestConfig()).valueOrDefault("Key", "Default"));
    assertEquals("42", (new TestConfig()).valueOrDefault("foo", "42"));
  }

  /**
   * Method under test: {@link TestConfig#valueOrNull(String)}
   */
  @Test
  void testValueOrNull() {
    // Arrange, Act and Assert
    assertNull((new TestConfig()).valueOrNull("Key"));
  }
}

