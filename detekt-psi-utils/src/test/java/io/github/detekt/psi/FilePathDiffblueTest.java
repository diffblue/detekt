package io.github.detekt.psi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class FilePathDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link FilePath#FilePath(Path, Path, Path)}
  *   <li>{@link FilePath#toString()}
  *   <li>{@link FilePath#getAbsolutePath()}
  *   <li>{@link FilePath#getBasePath()}
  *   <li>{@link FilePath#getRelativePath()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    Path basePath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    Path relativePath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act
    FilePath actualFilePath = new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), basePath,
        relativePath);
    String actualToStringResult = actualFilePath.toString();

    // Assert
    Path component1Result = actualFilePath.component1();
    assertSame(component1Result, actualFilePath.getAbsolutePath());
    Path basePath2 = actualFilePath.getBasePath();
    assertSame(basePath, basePath2);
    assertEquals(component1Result, basePath2);
    Path relativePath2 = actualFilePath.getRelativePath();
    assertEquals(relativePath2, basePath2);
    assertSame(relativePath, relativePath2);
    assertEquals(basePath, relativePath2);
    assertEquals(component1Result, relativePath2);
    String toStringResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString();
    String toStringResult2 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString();
    assertEquals(String.join("", "FilePath(absolutePath=", toStringResult, ", basePath=", toStringResult2,
        ", relativePath=", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), ")"),
        actualToStringResult);
  }

  /**
   * Method under test: {@link FilePath#FilePath(Path, Path, Path)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    Path basePath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act
    FilePath actualFilePath = new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), basePath,
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Assert
    Path component1Result = actualFilePath.component1();
    assertEquals(basePath, component1Result);
    assertEquals(basePath, actualFilePath.getRelativePath());
    assertEquals(component1Result, actualFilePath.getBasePath());
  }

  /**
   * Method under test: {@link FilePath#FilePath(Path, Path, Path)}
   */
  @Test
  void testConstructor3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "absolutePath"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));

  }

  /**
   * Method under test: {@link FilePath#FilePath(Path, Path, Path)}
   */
  @Test
  void testConstructor4() {
    // Arrange
    System.getProperty("java.io.tmpdir");
    Path relativePath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act
    FilePath actualFilePath = new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), null,
        relativePath);

    // Assert
    Path component1Result = actualFilePath.component1();
    assertEquals(relativePath, component1Result);
    assertEquals(component1Result, actualFilePath.getRelativePath());
    assertNull(actualFilePath.getBasePath());
  }

  /**
   * Method under test: {@link FilePath#FilePath(Path, Path, Path)}
   */
  @Test
  void testConstructor5() {
    // Arrange
    Path basePath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    System.getProperty("java.io.tmpdir");

    // Act
    FilePath actualFilePath = new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"), basePath, null);

    // Assert
    Path component1Result = actualFilePath.component1();
    assertEquals(basePath, component1Result);
    assertNull(actualFilePath.getRelativePath());
    assertEquals(component1Result, actualFilePath.getBasePath());
  }
}

