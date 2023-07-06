package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class CompilerModelDiffblueTest {
  /**
   * Method under test: {@link CompilerModel#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals("Jvm Target", (new CompilerModel("Jvm Target", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).component1());
  }

  /**
   * Method under test: {@link CompilerModel#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertEquals("en", (new CompilerModel("Jvm Target", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).component2());
  }

  /**
   * Method under test: {@link CompilerModel#component3()}
   */
  @Test
  void testComponent3() {
    // Arrange, Act and Assert
    assertEquals("Classpath", (new CompilerModel("Jvm Target", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).component3());
  }

  /**
   * Method under test: {@link CompilerModel#component4()}
   */
  @Test
  void testComponent4() {
    // Arrange
    Path jdkHome = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act and Assert
    assertSame(jdkHome, (new CompilerModel("Jvm Target", "en", "Classpath", jdkHome)).component4());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link CompilerModel#CompilerModel(String, String, String, Path)}
  *   <li>{@link CompilerModel#toString()}
  *   <li>{@link CompilerModel#getClasspath()}
  *   <li>{@link CompilerModel#getJdkHome()}
  *   <li>{@link CompilerModel#getJvmTarget()}
  *   <li>{@link CompilerModel#getLanguageVersion()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    Path jdkHome = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act
    CompilerModel actualCompilerModel = new CompilerModel("Jvm Target", "en", "Classpath", jdkHome);
    String actualToStringResult = actualCompilerModel.toString();

    // Assert
    assertEquals("Classpath", actualCompilerModel.getClasspath());
    assertSame(jdkHome, actualCompilerModel.getJdkHome());
    assertEquals("Jvm Target", actualCompilerModel.getJvmTarget());
    assertEquals("en", actualCompilerModel.getLanguageVersion());
    assertEquals(
        String.join("", "CompilerModel(jvmTarget=Jvm Target, languageVersion=en, classpath=Classpath, jdkHome=",
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), ")"),
        actualToStringResult);
  }

  /**
   * Method under test: {@link CompilerModel#CompilerModel(String, String, String, Path)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    Path jdkHome = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act
    CompilerModel actualCompilerModel = new CompilerModel("Jvm Target", "en", "Classpath", jdkHome);

    // Assert
    assertEquals("Jvm Target", actualCompilerModel.component1());
    assertEquals("en", actualCompilerModel.getLanguageVersion());
    assertSame(jdkHome, actualCompilerModel.getJdkHome());
    assertEquals("Classpath", actualCompilerModel.getClasspath());
  }

  /**
   * Method under test: {@link CompilerModel#copy(String, String, String, Path)}
   */
  @Test
  void testCopy() {
    // Arrange
    Path jdkHome = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act
    CompilerModel actualCopyResult = (new CompilerModel("Jvm Target", "en", "Classpath", jdkHome)).copy("Jvm Target",
        "en", "Classpath", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Assert
    assertEquals("Jvm Target", actualCopyResult.component1());
    assertEquals("en", actualCopyResult.getLanguageVersion());
    assertEquals(jdkHome, actualCopyResult.getJdkHome());
    assertEquals("Classpath", actualCopyResult.getClasspath());
  }

  /**
   * Method under test: {@link CompilerModel#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(
        new CompilerModel("Jvm Target", "en", "Classpath", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")),
        null);
    assertNotEquals(
        new CompilerModel("Jvm Target", "en", "Classpath", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")),
        "Different type to CompilerModel");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link CompilerModel#equals(Object)}
   *   <li>{@link CompilerModel#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    CompilerModel compilerModel = new CompilerModel("Jvm Target", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Act and Assert
    assertEquals(compilerModel, compilerModel);
    int expectedHashCodeResult = compilerModel.hashCode();
    assertEquals(expectedHashCodeResult, compilerModel.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link CompilerModel#equals(Object)}
   *   <li>{@link CompilerModel#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    CompilerModel compilerModel = new CompilerModel("Jvm Target", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    CompilerModel compilerModel2 = new CompilerModel("Jvm Target", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Act and Assert
    assertEquals(compilerModel, compilerModel2);
    int expectedHashCodeResult = compilerModel.hashCode();
    assertEquals(expectedHashCodeResult, compilerModel2.hashCode());
  }

  /**
   * Method under test: {@link CompilerModel#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    CompilerModel compilerModel = new CompilerModel("io.github.detekt.tooling.dsl.CompilerModel", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Act and Assert
    assertNotEquals(compilerModel, new CompilerModel("Jvm Target", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  /**
   * Method under test: {@link CompilerModel#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    CompilerModel compilerModel = new CompilerModel("Jvm Target", "eng", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Act and Assert
    assertNotEquals(compilerModel, new CompilerModel("Jvm Target", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  /**
   * Method under test: {@link CompilerModel#equals(Object)}
   */
  @Test
  void testEquals6() {
    // Arrange
    CompilerModel compilerModel = new CompilerModel("Jvm Target", "en", "io.github.detekt.tooling.dsl.CompilerModel",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Act and Assert
    assertNotEquals(compilerModel, new CompilerModel("Jvm Target", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  /**
   * Method under test: {@link CompilerModel#equals(Object)}
   */
  @Test
  void testEquals7() {
    // Arrange
    CompilerModel compilerModel = new CompilerModel("Jvm Target", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "foo"));

    // Act and Assert
    assertNotEquals(compilerModel, new CompilerModel("Jvm Target", "en", "Classpath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }
}

