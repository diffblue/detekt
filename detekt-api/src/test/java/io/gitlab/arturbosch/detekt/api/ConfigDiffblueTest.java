package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import io.gitlab.arturbosch.detekt.test.TestConfig;
import kotlin.Pair;
import org.junit.jupiter.api.Test;

class ConfigDiffblueTest {
  /**
  * Method under test: {@link Config.DefaultImpls#getParentPath(Config)}
  */
  @Test
  void testDefaultImplsGetParentPath() {
    // Arrange, Act and Assert
    assertNull(Config.DefaultImpls.getParentPath(new TestConfig()));
  }

  /**
   * Method under test: {@link Config.DefaultImpls#valueOrDefault(Config, String, Object)}
   */
  @Test
  void testDefaultImplsValueOrDefault() {
    // Arrange, Act and Assert
    assertEquals("Default", Config.DefaultImpls.valueOrDefault(new TestConfig(), "Key", "Default"));
    assertEquals("Default",
        Config.DefaultImpls.valueOrDefault(new TestConfigAware(new Pair<>("key", "Second")), "Key", "Default"));
    assertEquals("Default", Config.DefaultImpls.valueOrDefault(new TestConfigAware(), "Key", "Default"));
  }

  /**
   * Method under test: {@link Config.InvalidConfigurationError#InvalidConfigurationError()}
   */
  @Test
  void testInvalidConfigurationErrorConstructor() {
    // Arrange and Act
    Config.InvalidConfigurationError actualInvalidConfigurationError = new Config.InvalidConfigurationError();

    // Assert
    assertNull(actualInvalidConfigurationError.getCause());
    assertEquals(0, actualInvalidConfigurationError.getSuppressed().length);
    assertEquals("Provided configuration file is invalid: Structure must be from type Map<String,Any>!",
        actualInvalidConfigurationError.getMessage());
    assertEquals("Provided configuration file is invalid: Structure must be from type Map<String,Any>!",
        actualInvalidConfigurationError.getLocalizedMessage());
  }

  /**
   * Method under test: {@link Config.InvalidConfigurationError#InvalidConfigurationError(Throwable)}
   */
  @Test
  void testInvalidConfigurationErrorConstructor2() {
    // Arrange
    Throwable throwable = new Throwable();

    // Act and Assert
    assertSame((new Config.InvalidConfigurationError(throwable)).getCause(), throwable);
  }

  /**
   * Method under test: {@link Config.InvalidConfigurationError#InvalidConfigurationError(Throwable)}
   */
  @Test
  void testInvalidConfigurationErrorConstructor3() {
    // Arrange and Act
    Config.InvalidConfigurationError actualInvalidConfigurationError = new Config.InvalidConfigurationError(null);

    // Assert
    assertNull(actualInvalidConfigurationError.getCause());
    assertEquals(0, actualInvalidConfigurationError.getSuppressed().length);
    assertEquals("Provided configuration file is invalid: Structure must be from type Map<String,Any>!",
        actualInvalidConfigurationError.getMessage());
    assertEquals("Provided configuration file is invalid: Structure must be from type Map<String,Any>!",
        actualInvalidConfigurationError.getLocalizedMessage());
  }
}

