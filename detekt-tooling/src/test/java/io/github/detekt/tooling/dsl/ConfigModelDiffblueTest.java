package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Test;

class ConfigModelDiffblueTest {
  /**
   * Method under test: {@link ConfigModel#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();

    // Act and Assert
    assertTrue((new ConfigModel(true, knownPatterns, true, resources, new ArrayList<>())).component1());
  }

  /**
   * Method under test: {@link ConfigModel#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();

    // Act
    Collection<String> actualComponent2Result = (new ConfigModel(true, knownPatterns, true, resources,
        new ArrayList<>())).component2();

    // Assert
    assertSame(knownPatterns, actualComponent2Result);
    assertTrue(actualComponent2Result.isEmpty());
  }

  /**
   * Method under test: {@link ConfigModel#component3()}
   */
  @Test
  void testComponent3() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();

    // Act and Assert
    assertTrue((new ConfigModel(true, knownPatterns, true, resources, new ArrayList<>())).component3());
  }

  /**
   * Method under test: {@link ConfigModel#component4()}
   */
  @Test
  void testComponent4() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();

    // Act
    Collection<URL> actualComponent4Result = (new ConfigModel(true, knownPatterns, true, resources, new ArrayList<>()))
        .component4();

    // Assert
    assertSame(resources, actualComponent4Result);
    assertTrue(actualComponent4Result.isEmpty());
  }

  /**
   * Method under test: {@link ConfigModel#component5()}
   */
  @Test
  void testComponent5() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();
    ArrayList<Path> configPaths = new ArrayList<>();

    // Act
    Collection<Path> actualComponent5Result = (new ConfigModel(true, knownPatterns, true, resources, configPaths))
        .component5();

    // Assert
    assertSame(configPaths, actualComponent5Result);
    assertTrue(actualComponent5Result.isEmpty());
  }

  /**
   * Method under test: {@link ConfigModel#component1()}
   */
  @Test
  void testComponent12() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();

    // Act and Assert
    assertFalse((new ConfigModel(false, knownPatterns, true, resources, new ArrayList<>())).component1());
  }

  /**
   * Method under test: {@link ConfigModel#component3()}
   */
  @Test
  void testComponent32() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();

    // Act and Assert
    assertFalse((new ConfigModel(true, knownPatterns, false, resources, new ArrayList<>())).component3());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ConfigModel#ConfigModel(Boolean, Collection, boolean, Collection, Collection)}
  *   <li>{@link ConfigModel#toString()}
  *   <li>{@link ConfigModel#getConfigPaths()}
  *   <li>{@link ConfigModel#getKnownPatterns()}
  *   <li>{@link ConfigModel#getResources()}
  *   <li>{@link ConfigModel#getShouldValidateBeforeAnalysis()}
  *   <li>{@link ConfigModel#getUseDefaultConfig()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();
    ArrayList<Path> configPaths = new ArrayList<>();

    // Act
    ConfigModel actualConfigModel = new ConfigModel(true, knownPatterns, true, resources, configPaths);
    String actualToStringResult = actualConfigModel.toString();

    // Assert
    Collection<Path> configPaths2 = actualConfigModel.getConfigPaths();
    assertSame(configPaths, configPaths2);
    Collection<String> knownPatterns2 = actualConfigModel.getKnownPatterns();
    assertEquals(knownPatterns2, configPaths2);
    Collection<URL> resources2 = actualConfigModel.getResources();
    assertEquals(resources2, configPaths2);
    assertSame(knownPatterns, knownPatterns2);
    assertEquals(configPaths, knownPatterns2);
    assertEquals(resources2, knownPatterns2);
    assertSame(resources, resources2);
    assertEquals(knownPatterns, resources2);
    assertEquals(configPaths, resources2);
    assertTrue(actualConfigModel.getShouldValidateBeforeAnalysis());
    assertTrue(actualConfigModel.getUseDefaultConfig());
    assertEquals("ConfigModel(shouldValidateBeforeAnalysis=true, knownPatterns=[], useDefaultConfig=true, resources=[],"
        + " configPaths=[])", actualToStringResult);
  }

  /**
   * Method under test: {@link ConfigModel#ConfigModel(Boolean, Collection, boolean, Collection, Collection)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();
    ArrayList<Path> configPaths = new ArrayList<>();

    // Act
    ConfigModel actualConfigModel = new ConfigModel(true, knownPatterns, true, resources, configPaths);

    // Assert
    assertTrue(actualConfigModel.component1());
    assertTrue(actualConfigModel.getUseDefaultConfig());
    assertEquals(knownPatterns, actualConfigModel.getResources());
    Collection<String> knownPatterns2 = actualConfigModel.getKnownPatterns();
    assertEquals(configPaths, knownPatterns2);
    assertEquals(knownPatterns2, actualConfigModel.getConfigPaths());
  }

  /**
   * Method under test: {@link ConfigModel#copy(Boolean, Collection, boolean, Collection, Collection)}
   */
  @Test
  void testCopy() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();
    ConfigModel configModel = new ConfigModel(true, knownPatterns, true, resources, new ArrayList<>());
    ArrayList<String> knownPatterns2 = new ArrayList<>();
    ArrayList<URL> resources2 = new ArrayList<>();
    ArrayList<Path> configPaths = new ArrayList<>();

    // Act
    ConfigModel actualCopyResult = configModel.copy(true, knownPatterns2, true, resources2, configPaths);

    // Assert
    assertTrue(actualCopyResult.component1());
    assertTrue(actualCopyResult.getUseDefaultConfig());
    assertEquals(knownPatterns2, actualCopyResult.getResources());
    assertEquals(configPaths, actualCopyResult.getKnownPatterns());
    assertEquals(knownPatterns, actualCopyResult.getConfigPaths());
  }

  /**
   * Method under test: {@link ConfigModel#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();

    // Act and Assert
    assertNotEquals(new ConfigModel(true, knownPatterns, true, resources, new ArrayList<>()), null);
  }

  /**
   * Method under test: {@link ConfigModel#equals(Object)}
   */
  @Test
  void testEquals2() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();

    // Act and Assert
    assertNotEquals(new ConfigModel(true, knownPatterns, true, resources, new ArrayList<>()),
        "Different type to ConfigModel");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ConfigModel#equals(Object)}
   *   <li>{@link ConfigModel#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();
    ConfigModel configModel = new ConfigModel(true, knownPatterns, true, resources, new ArrayList<>());

    // Act and Assert
    assertEquals(configModel, configModel);
    int expectedHashCodeResult = configModel.hashCode();
    assertEquals(expectedHashCodeResult, configModel.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ConfigModel#equals(Object)}
   *   <li>{@link ConfigModel#hashCode()}
   * </ul>
   */
  @Test
  void testEquals4() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();
    ConfigModel configModel = new ConfigModel(true, knownPatterns, true, resources, new ArrayList<>());
    ArrayList<String> knownPatterns2 = new ArrayList<>();
    ArrayList<URL> resources2 = new ArrayList<>();
    ConfigModel configModel2 = new ConfigModel(true, knownPatterns2, true, resources2, new ArrayList<>());

    // Act and Assert
    assertEquals(configModel, configModel2);
    int expectedHashCodeResult = configModel.hashCode();
    assertEquals(expectedHashCodeResult, configModel2.hashCode());
  }

  /**
   * Method under test: {@link ConfigModel#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();
    ConfigModel configModel = new ConfigModel(false, knownPatterns, true, resources, new ArrayList<>());
    ArrayList<String> knownPatterns2 = new ArrayList<>();
    ArrayList<URL> resources2 = new ArrayList<>();

    // Act and Assert
    assertNotEquals(configModel, new ConfigModel(true, knownPatterns2, true, resources2, new ArrayList<>()));
  }

  /**
   * Method under test: {@link ConfigModel#equals(Object)}
   */
  @Test
  void testEquals6() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    knownPatterns.add("foo");
    ArrayList<URL> resources = new ArrayList<>();
    ConfigModel configModel = new ConfigModel(true, knownPatterns, true, resources, new ArrayList<>());
    ArrayList<String> knownPatterns2 = new ArrayList<>();
    ArrayList<URL> resources2 = new ArrayList<>();

    // Act and Assert
    assertNotEquals(configModel, new ConfigModel(true, knownPatterns2, true, resources2, new ArrayList<>()));
  }

  /**
   * Method under test: {@link ConfigModel#equals(Object)}
   */
  @Test
  void testEquals7() {
    // Arrange
    ArrayList<String> knownPatterns = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();
    ConfigModel configModel = new ConfigModel(true, knownPatterns, false, resources, new ArrayList<>());
    ArrayList<String> knownPatterns2 = new ArrayList<>();
    ArrayList<URL> resources2 = new ArrayList<>();

    // Act and Assert
    assertNotEquals(configModel, new ConfigModel(true, knownPatterns2, true, resources2, new ArrayList<>()));
  }

  /**
   * Method under test: {@link ConfigModel#equals(Object)}
   */
  @Test
  void testEquals8() throws MalformedURLException {
    // Arrange
    ArrayList<URL> resources = new ArrayList<>();
    resources.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL());
    ArrayList<String> knownPatterns = new ArrayList<>();
    ConfigModel configModel = new ConfigModel(true, knownPatterns, true, resources, new ArrayList<>());
    ArrayList<String> knownPatterns2 = new ArrayList<>();
    ArrayList<URL> resources2 = new ArrayList<>();

    // Act and Assert
    assertNotEquals(configModel, new ConfigModel(true, knownPatterns2, true, resources2, new ArrayList<>()));
  }

  /**
   * Method under test: {@link ConfigModel#equals(Object)}
   */
  @Test
  void testEquals9() {
    // Arrange
    ArrayList<Path> configPaths = new ArrayList<>();
    configPaths.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    ArrayList<String> knownPatterns = new ArrayList<>();
    ConfigModel configModel = new ConfigModel(true, knownPatterns, true, new ArrayList<>(), configPaths);
    ArrayList<String> knownPatterns2 = new ArrayList<>();
    ArrayList<URL> resources = new ArrayList<>();

    // Act and Assert
    assertNotEquals(configModel, new ConfigModel(true, knownPatterns2, true, resources, new ArrayList<>()));
  }
}

