package io.gitlab.arturbosch.detekt.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class ReportPathDiffblueTest {
  /**
   * Method under test: {@link ReportPath#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals("Kind",
        (new ReportPath("Kind", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).component1());
  }

  /**
   * Method under test: {@link ReportPath#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act and Assert
    assertSame(path, (new ReportPath("Kind", path)).component2());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ReportPath#ReportPath(String, Path)}
  *   <li>{@link ReportPath#toString()}
  *   <li>{@link ReportPath#getKind()}
  *   <li>{@link ReportPath#getPath()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act
    ReportPath actualReportPath = new ReportPath("Kind", path);
    String actualToStringResult = actualReportPath.toString();

    // Assert
    assertEquals("Kind", actualReportPath.getKind());
    assertSame(path, actualReportPath.getPath());
    assertEquals(String.join("", "ReportPath(kind=Kind, path=",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), ")"), actualToStringResult);
  }

  /**
   * Method under test: {@link ReportPath#ReportPath(String, Path)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act
    ReportPath actualReportPath = new ReportPath("Kind", path);

    // Assert
    assertEquals("Kind", actualReportPath.component1());
    assertSame(path, actualReportPath.getPath());
  }

  /**
   * Method under test: {@link ReportPath#copy(String, Path)}
   */
  @Test
  void testCopy() {
    // Arrange
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");

    // Act
    ReportPath actualCopyResult = (new ReportPath("Kind", path)).copy("Kind",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Assert
    assertEquals("Kind", actualCopyResult.component1());
    assertEquals(path, actualCopyResult.getPath());
  }

  /**
   * Method under test: {@link ReportPath#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new ReportPath("Kind", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")), null);
    assertNotEquals(new ReportPath("Kind", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")),
        "Different type to ReportPath");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ReportPath#equals(Object)}
   *   <li>{@link ReportPath#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    ReportPath reportPath = new ReportPath("Kind", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Act and Assert
    assertEquals(reportPath, reportPath);
    int expectedHashCodeResult = reportPath.hashCode();
    assertEquals(expectedHashCodeResult, reportPath.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ReportPath#equals(Object)}
   *   <li>{@link ReportPath#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    ReportPath reportPath = new ReportPath("Kind", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    ReportPath reportPath2 = new ReportPath("Kind", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Act and Assert
    assertEquals(reportPath, reportPath2);
    int expectedHashCodeResult = reportPath.hashCode();
    assertEquals(expectedHashCodeResult, reportPath2.hashCode());
  }

  /**
   * Method under test: {@link ReportPath#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    ReportPath reportPath = new ReportPath("io.gitlab.arturbosch.detekt.cli.ReportPath",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Act and Assert
    assertNotEquals(reportPath, new ReportPath("Kind", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  /**
   * Method under test: {@link ReportPath#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    ReportPath reportPath = new ReportPath("Kind", Paths.get(System.getProperty("java.io.tmpdir"), "foo"));

    // Act and Assert
    assertNotEquals(reportPath, new ReportPath("Kind", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }
}

