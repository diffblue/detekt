package io.gitlab.arturbosch.detekt.core.baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class DefaultBaselineDiffblueTest {
  /**
   * Method under test: {@link DefaultBaseline#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();

    // Act
    Set<String> actualComponent1Result = (new DefaultBaseline(manuallySuppressedIssues, new HashSet<>())).component1();

    // Assert
    assertSame(manuallySuppressedIssues, actualComponent1Result);
    assertTrue(actualComponent1Result.isEmpty());
  }

  /**
   * Method under test: {@link DefaultBaseline#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    HashSet<String> currentIssues = new HashSet<>();

    // Act
    Set<String> actualComponent2Result = (new DefaultBaseline(manuallySuppressedIssues, currentIssues)).component2();

    // Assert
    assertSame(currentIssues, actualComponent2Result);
    assertTrue(actualComponent2Result.isEmpty());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link DefaultBaseline#DefaultBaseline(Set, Set)}
  *   <li>{@link DefaultBaseline#toString()}
  *   <li>{@link DefaultBaseline#getCurrentIssues()}
  *   <li>{@link DefaultBaseline#getManuallySuppressedIssues()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    HashSet<String> currentIssues = new HashSet<>();

    // Act
    DefaultBaseline actualDefaultBaseline = new DefaultBaseline(manuallySuppressedIssues, currentIssues);
    String actualToStringResult = actualDefaultBaseline.toString();

    // Assert
    assertSame(currentIssues, actualDefaultBaseline.getCurrentIssues());
    Set<String> expectedManuallySuppressedIssues = actualDefaultBaseline.component1();
    assertSame(expectedManuallySuppressedIssues, actualDefaultBaseline.getManuallySuppressedIssues());
    assertEquals("DefaultBaseline(manuallySuppressedIssues=[], currentIssues=[])", actualToStringResult);
  }

  /**
   * Method under test: {@link DefaultBaseline#DefaultBaseline(Set, Set)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();

    // Act
    DefaultBaseline actualDefaultBaseline = new DefaultBaseline(manuallySuppressedIssues, new HashSet<>());

    // Assert
    assertTrue(actualDefaultBaseline.component1().isEmpty());
    assertTrue(actualDefaultBaseline.getCurrentIssues().isEmpty());
  }

  /**
   * Method under test: {@link DefaultBaseline#contains(String)}
   */
  @Test
  void testContains() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();

    // Act and Assert
    assertFalse((new DefaultBaseline(manuallySuppressedIssues, new HashSet<>())).contains("42"));
  }

  /**
   * Method under test: {@link DefaultBaseline#contains(String)}
   */
  @Test
  void testContains2() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    manuallySuppressedIssues.add("42");

    // Act and Assert
    assertTrue((new DefaultBaseline(manuallySuppressedIssues, new HashSet<>())).contains("42"));
  }

  /**
   * Method under test: {@link DefaultBaseline#contains(String)}
   */
  @Test
  void testContains3() {
    // Arrange
    HashSet<String> currentIssues = new HashSet<>();
    currentIssues.add("42");

    // Act and Assert
    assertTrue((new DefaultBaseline(new HashSet<>(), currentIssues)).contains("42"));
  }

  /**
   * Method under test: {@link DefaultBaseline#copy(Set, Set)}
   */
  @Test
  void testCopy() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    DefaultBaseline defaultBaseline = new DefaultBaseline(manuallySuppressedIssues, new HashSet<>());
    HashSet<String> manuallySuppressedIssues2 = new HashSet<>();

    // Act
    DefaultBaseline actualCopyResult = defaultBaseline.copy(manuallySuppressedIssues2, new HashSet<>());

    // Assert
    assertTrue(actualCopyResult.component1().isEmpty());
    assertTrue(actualCopyResult.getCurrentIssues().isEmpty());
  }

  /**
   * Method under test: {@link DefaultBaseline#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();

    // Act and Assert
    assertNotEquals(new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()), null);
  }

  /**
   * Method under test: {@link DefaultBaseline#equals(Object)}
   */
  @Test
  void testEquals2() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();

    // Act and Assert
    assertNotEquals(new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()),
        "Different type to DefaultBaseline");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link DefaultBaseline#equals(Object)}
   *   <li>{@link DefaultBaseline#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    DefaultBaseline defaultBaseline = new DefaultBaseline(manuallySuppressedIssues, new HashSet<>());

    // Act and Assert
    assertEquals(defaultBaseline, defaultBaseline);
    int expectedHashCodeResult = defaultBaseline.hashCode();
    assertEquals(expectedHashCodeResult, defaultBaseline.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link DefaultBaseline#equals(Object)}
   *   <li>{@link DefaultBaseline#hashCode()}
   * </ul>
   */
  @Test
  void testEquals4() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    DefaultBaseline defaultBaseline = new DefaultBaseline(manuallySuppressedIssues, new HashSet<>());
    HashSet<String> manuallySuppressedIssues2 = new HashSet<>();
    DefaultBaseline defaultBaseline2 = new DefaultBaseline(manuallySuppressedIssues2, new HashSet<>());

    // Act and Assert
    assertEquals(defaultBaseline, defaultBaseline2);
    int expectedHashCodeResult = defaultBaseline.hashCode();
    assertEquals(expectedHashCodeResult, defaultBaseline2.hashCode());
  }

  /**
   * Method under test: {@link DefaultBaseline#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    manuallySuppressedIssues.add("foo");
    DefaultBaseline defaultBaseline = new DefaultBaseline(manuallySuppressedIssues, new HashSet<>());
    HashSet<String> manuallySuppressedIssues2 = new HashSet<>();

    // Act and Assert
    assertNotEquals(defaultBaseline, new DefaultBaseline(manuallySuppressedIssues2, new HashSet<>()));
  }

  /**
   * Method under test: {@link DefaultBaseline#equals(Object)}
   */
  @Test
  void testEquals6() {
    // Arrange
    HashSet<String> currentIssues = new HashSet<>();
    currentIssues.add("foo");
    DefaultBaseline defaultBaseline = new DefaultBaseline(new HashSet<>(), currentIssues);
    HashSet<String> manuallySuppressedIssues = new HashSet<>();

    // Act and Assert
    assertNotEquals(defaultBaseline, new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()));
  }
}

