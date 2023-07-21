package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import io.github.detekt.psi.FilePath;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class LocationDiffblueTest {
  /**
   * Method under test: {@link Location#compact()}
   */
  @Test
  void testCompact() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act
    String actualCompactResult = (new Location(source, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")))).compact();

    // Assert
    assertEquals(String.join("", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), ":2:1"),
        actualCompactResult);
  }

  /**
   * Method under test: {@link Location#compactWithSignature()}
   */
  @Test
  void testCompactWithSignature() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act
    String actualCompactWithSignatureResult = (new Location(source, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")))).compactWithSignature();

    // Assert
    assertEquals(String.join("", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), ":2:1"),
        actualCompactWithSignatureResult);
  }

  /**
   * Method under test: {@link Location#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act and Assert
    assertSame(source,
        (new Location(source, text,
            new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")))).component1());
  }

  /**
   * Method under test: {@link Location#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act and Assert
    assertSame(text,
        (new Location(source, text,
            new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")))).component2());
  }

  /**
   * Method under test: {@link Location#component3()}
   */
  @Test
  void testComponent3() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act
    String actualComponent3Result = (new Location(source, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")))).component3();

    // Assert
    assertEquals(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), actualComponent3Result);
  }

  /**
   * Method under test: {@link Location#component4()}
   */
  @Test
  void testComponent4() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    FilePath filePath = new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Act and Assert
    assertSame(filePath, (new Location(source, text, filePath)).component4());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Location#Location(SourceLocation, TextLocation, FilePath)}
  *   <li>{@link Location#toString()}
  *   <li>{@link Location#getSource()}
  *   <li>{@link Location#getEndSource()}
  *   <li>{@link Location#getFile()}
  *   <li>{@link Location#getFilePath()}
  *   <li>{@link Location#getText()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    FilePath filePath = new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Act
    Location actualLocation = new Location(source, text, filePath);
    String actualToStringResult = actualLocation.toString();

    // Assert
    SourceLocation source2 = actualLocation.getSource();
    assertSame(source2, actualLocation.getEndSource());
    String expectedFile = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString();
    assertEquals(expectedFile, actualLocation.getFile());
    assertSame(filePath, actualLocation.getFilePath());
    assertSame(source, source2);
    assertSame(text, actualLocation.getText());
    String toStringResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString();
    String toStringResult2 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString();
    String toStringResult3 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString();
    assertEquals(String.join("", "Location(source=2:1, text=1:3, file=", toStringResult,
        ", filePath=FilePath(absolutePath=", toStringResult2, ", basePath=", toStringResult3, ", relativePath=",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), "))"), actualToStringResult);
  }

  /**
   * Method under test: {@link Location#Location(SourceLocation, SourceLocation, TextLocation, FilePath)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    SourceLocation endSource = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act
    Location actualLocation = new Location(source, endSource, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));

    // Assert
    String expectedCompactResult = String.join("",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), ":2:1");
    assertEquals(expectedCompactResult, actualLocation.compact());
    assertSame(text, actualLocation.getText());
    SourceLocation source2 = actualLocation.getSource();
    assertEquals(endSource, source2);
    String expectedComponent3Result = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString();
    assertEquals(expectedComponent3Result, actualLocation.component3());
    assertEquals(source2, actualLocation.getEndSource());
  }

  /**
   * Method under test: {@link Location#Location(SourceLocation, TextLocation, FilePath)}
   */
  @Test
  void testConstructor3() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act
    Location actualLocation = new Location(source, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));

    // Assert
    String expectedCompactResult = String.join("",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), ":2:1");
    assertEquals(expectedCompactResult, actualLocation.compact());
    assertSame(text, actualLocation.getText());
    String expectedComponent3Result = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString();
    assertEquals(expectedComponent3Result, actualLocation.component3());
    SourceLocation expectedEndSource = actualLocation.getSource();
    assertSame(expectedEndSource, actualLocation.getEndSource());
  }

  /**
   * Method under test: {@link Location#Location(SourceLocation, TextLocation, String)}
   */
  @Test
  void testConstructor4() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act
    Location actualLocation = new Location(source, text, "File");

    // Assert
    assertEquals("File:2:1", actualLocation.compact());
    assertSame(text, actualLocation.getText());
    assertEquals("File", actualLocation.component3());
    SourceLocation expectedEndSource = actualLocation.getSource();
    assertSame(expectedEndSource, actualLocation.getEndSource());
    FilePath filePath = actualLocation.getFilePath();
    assertNull(filePath.component3());
    assertNull(filePath.component2());
  }

  /**
   * Method under test: {@link Location#Location(SourceLocation, TextLocation, String, FilePath)}
   */
  @Test
  void testConstructor5() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act
    Location actualLocation = new Location(source, text, "File",
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));

    // Assert
    String expectedCompactResult = String.join("",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), ":2:1");
    assertEquals(expectedCompactResult, actualLocation.compact());
    assertSame(text, actualLocation.getText());
    assertEquals("File", actualLocation.component3());
    SourceLocation expectedEndSource = actualLocation.getSource();
    assertSame(expectedEndSource, actualLocation.getEndSource());
  }

  /**
   * Method under test: {@link Location#Location(SourceLocation, TextLocation, String, String)}
   */
  @Test
  void testConstructor6() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act
    Location actualLocation = new Location(source, text, "Location String", "File");

    // Assert
    assertEquals("File:2:1", actualLocation.compact());
    assertSame(text, actualLocation.getText());
    assertEquals("File", actualLocation.component3());
    SourceLocation expectedEndSource = actualLocation.getSource();
    assertSame(expectedEndSource, actualLocation.getEndSource());
    FilePath filePath = actualLocation.getFilePath();
    assertNull(filePath.component3());
    assertNull(filePath.component2());
  }

  /**
   * Method under test: {@link Location#copy(SourceLocation, TextLocation, String, FilePath)}
   */
  @Test
  void testCopy() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    FilePath filePath = new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    Location location = new Location(source, text, filePath);
    SourceLocation source2 = new SourceLocation(2, 1);

    TextLocation text2 = new TextLocation(1, 3);

    // Act
    Location actualCopyResult = location.copy(source2, text2, "File",
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));

    // Assert
    assertEquals(text, actualCopyResult.getText());
    SourceLocation source3 = actualCopyResult.getSource();
    assertEquals(source, source3);
    assertEquals("File", actualCopyResult.component3());
    assertEquals(filePath, actualCopyResult.getFilePath());
    assertSame(source3, actualCopyResult.getEndSource());
  }

  /**
   * Method under test: {@link Location#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act and Assert
    assertNotEquals(new Location(source, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))),
        null);
  }

  /**
   * Method under test: {@link Location#equals(Object)}
   */
  @Test
  void testEquals2() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act and Assert
    assertNotEquals(new Location(source, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))),
        "Different type to Location");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Location#equals(Object)}
   *   <li>{@link Location#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    Location location = new Location(source, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));

    // Act and Assert
    assertEquals(location, location);
    int expectedHashCodeResult = location.hashCode();
    assertEquals(expectedHashCodeResult, location.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Location#equals(Object)}
   *   <li>{@link Location#hashCode()}
   * </ul>
   */
  @Test
  void testEquals4() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    Location location = new Location(source, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
    SourceLocation source2 = new SourceLocation(2, 1);

    TextLocation text2 = new TextLocation(1, 3);

    Location location2 = new Location(source2, text2,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));

    // Act and Assert
    assertEquals(location, location2);
    int expectedHashCodeResult = location.hashCode();
    assertEquals(expectedHashCodeResult, location2.hashCode());
  }

  /**
   * Method under test: {@link Location#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    SourceLocation source = new SourceLocation(1, 1);

    TextLocation text = new TextLocation(1, 3);

    Location location = new Location(source, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
    SourceLocation source2 = new SourceLocation(2, 1);

    TextLocation text2 = new TextLocation(1, 3);

    // Act and Assert
    assertNotEquals(location,
        new Location(source2, text2,
            new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }

  /**
   * Method under test: {@link Location#equals(Object)}
   */
  @Test
  void testEquals6() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(2, 3);

    Location location = new Location(source, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
    SourceLocation source2 = new SourceLocation(2, 1);

    TextLocation text2 = new TextLocation(1, 3);

    // Act and Assert
    assertNotEquals(location,
        new Location(source2, text2,
            new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }

  /**
   * Method under test: {@link Location#equals(Object)}
   */
  @Test
  void testEquals7() {
    // Arrange
    SourceLocation source = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    Location location = new Location(source, text,
        new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "foo"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
    SourceLocation source2 = new SourceLocation(2, 1);

    TextLocation text2 = new TextLocation(1, 3);

    // Act and Assert
    assertNotEquals(location,
        new Location(source2, text2,
            new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }

  /**
   * Method under test: {@link Location#equals(Object)}
   */
  @Test
  void testEquals8() {
    // Arrange
    new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    SourceLocation source = new SourceLocation(2, 1);

    Location location = new Location(source, new TextLocation(1, 3), "File");
    SourceLocation source2 = new SourceLocation(2, 1);

    TextLocation text = new TextLocation(1, 3);

    // Act and Assert
    assertNotEquals(location,
        new Location(source2, text,
            new FilePath(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))));
  }
}

