package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class BaselineModelDiffblueTest {
  /**
   * Method under test: {@link BaselineModel#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act and Assert
    assertSame(path, (new BaselineModel(path, true)).component1());
  }

  /**
   * Method under test: {@link BaselineModel#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertTrue((new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), true)).component2());
    assertFalse((new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), false)).component2());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link BaselineModel#BaselineModel(Path, boolean)}
  *   <li>{@link BaselineModel#toString()}
  *   <li>{@link BaselineModel#getPath()}
  *   <li>{@link BaselineModel#getShouldCreateDuringAnalysis()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    BaselineModel actualBaselineModel = new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        true);
    String actualToStringResult = actualBaselineModel.toString();

    // Assert
    Path expectedPath = actualBaselineModel.component1();
    assertSame(expectedPath, actualBaselineModel.getPath());
    assertTrue(actualBaselineModel.getShouldCreateDuringAnalysis());
    assertEquals(String.join("", "BaselineModel(path=",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), ", shouldCreateDuringAnalysis=true)"),
        actualToStringResult);
  }

  /**
   * Method under test: {@link BaselineModel#copy(Path, boolean)}
   */
  @Test
  void testCopy() {
    // Arrange
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act
    BaselineModel actualCopyResult = (new BaselineModel(path, true))
        .copy(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), true);

    // Assert
    assertEquals(path, actualCopyResult.component1());
    assertTrue(actualCopyResult.getShouldCreateDuringAnalysis());
  }

  /**
   * Method under test: {@link BaselineModel#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), true), null);
    assertNotEquals(new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), true),
        "Different type to BaselineModel");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link BaselineModel#equals(Object)}
   *   <li>{@link BaselineModel#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    BaselineModel baselineModel = new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), true);

    // Act and Assert
    assertEquals(baselineModel, baselineModel);
    int expectedHashCodeResult = baselineModel.hashCode();
    assertEquals(expectedHashCodeResult, baselineModel.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link BaselineModel#equals(Object)}
   *   <li>{@link BaselineModel#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    BaselineModel baselineModel = new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), true);
    BaselineModel baselineModel2 = new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), true);

    // Act and Assert
    assertEquals(baselineModel, baselineModel2);
    int expectedHashCodeResult = baselineModel.hashCode();
    assertEquals(expectedHashCodeResult, baselineModel2.hashCode());
  }

  /**
   * Method under test: {@link BaselineModel#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    BaselineModel baselineModel = new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "foo"), true);

    // Act and Assert
    assertNotEquals(baselineModel,
        new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), true));
  }

  /**
   * Method under test: {@link BaselineModel#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    BaselineModel baselineModel = new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), false);

    // Act and Assert
    assertNotEquals(baselineModel,
        new BaselineModel(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), true));
  }
}

