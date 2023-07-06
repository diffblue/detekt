package io.github.detekt.tooling.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class FunctionMatcherDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link FunctionMatcher.NameOnly#NameOnly(String)}
  *   <li>{@link FunctionMatcher.NameOnly#toString()}
  * </ul>
  */
  @Test
  void testNameOnlyConstructor() {
    // Arrange, Act and Assert
    assertEquals("Dr Jane Doe", (new FunctionMatcher.NameOnly("Dr Jane Doe")).toString());
    assertEquals("Dr Jane Doe", (new FunctionMatcher.NameOnly("Dr Jane Doe")).toString());
  }

  /**
   * Method under test: {@link FunctionMatcher.NameOnly#copy(String)}
   */
  @Test
  void testNameOnlyCopy() {
    // Arrange, Act and Assert
    assertEquals("Dr Jane Doe", (new FunctionMatcher.NameOnly("Dr Jane Doe")).copy("Dr Jane Doe").toString());
  }

  /**
   * Method under test: {@link FunctionMatcher.NameOnly#equals(Object)}
   */
  @Test
  void testNameOnlyEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new FunctionMatcher.NameOnly("Dr Jane Doe"), null);
    assertNotEquals(new FunctionMatcher.NameOnly("Dr Jane Doe"), "Different type to NameOnly");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link FunctionMatcher.NameOnly#equals(Object)}
   *   <li>{@link FunctionMatcher.NameOnly#hashCode()}
   * </ul>
   */
  @Test
  void testNameOnlyEquals2() {
    // Arrange
    FunctionMatcher.NameOnly nameOnly = new FunctionMatcher.NameOnly("Dr Jane Doe");

    // Act and Assert
    assertEquals(nameOnly, nameOnly);
    int expectedHashCodeResult = nameOnly.hashCode();
    assertEquals(expectedHashCodeResult, nameOnly.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link FunctionMatcher.NameOnly#equals(Object)}
   *   <li>{@link FunctionMatcher.NameOnly#hashCode()}
   * </ul>
   */
  @Test
  void testNameOnlyEquals3() {
    // Arrange
    FunctionMatcher.NameOnly nameOnly = new FunctionMatcher.NameOnly("Dr Jane Doe");
    FunctionMatcher.NameOnly nameOnly2 = new FunctionMatcher.NameOnly("Dr Jane Doe");

    // Act and Assert
    assertEquals(nameOnly, nameOnly2);
    int expectedHashCodeResult = nameOnly.hashCode();
    assertEquals(expectedHashCodeResult, nameOnly2.hashCode());
  }

  /**
   * Method under test: {@link FunctionMatcher.NameOnly#equals(Object)}
   */
  @Test
  void testNameOnlyEquals4() {
    // Arrange
    FunctionMatcher.NameOnly nameOnly = new FunctionMatcher.NameOnly("Mr John Smith");

    // Act and Assert
    assertNotEquals(nameOnly, new FunctionMatcher.NameOnly("Dr Jane Doe"));
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link FunctionMatcher.WithParameters#WithParameters(String, List)}
   *   <li>{@link FunctionMatcher.WithParameters#toString()}
   * </ul>
   */
  @Test
  void testWithParametersConstructor() {
    // Arrange, Act and Assert
    assertEquals("Dr Jane Doe()", (new FunctionMatcher.WithParameters("Dr Jane Doe", new ArrayList<>())).toString());
  }

  /**
   * Method under test: {@link FunctionMatcher.WithParameters#WithParameters(String, List)}
   */
  @Test
  void testWithParametersConstructor2() {
    // Arrange
    ArrayList<String> parameters = new ArrayList<>();

    // Act
    new FunctionMatcher.WithParameters("Dr Jane Doe", parameters);

    // Assert
    assertTrue(parameters.isEmpty());
  }

  /**
   * Method under test: {@link FunctionMatcher.WithParameters#equals(Object)}
   */
  @Test
  void testWithParametersEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new FunctionMatcher.WithParameters("Dr Jane Doe", new ArrayList<>()), null);
    assertNotEquals(new FunctionMatcher.WithParameters("Dr Jane Doe", new ArrayList<>()),
        "Different type to WithParameters");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link FunctionMatcher.WithParameters#equals(Object)}
   *   <li>{@link FunctionMatcher.WithParameters#hashCode()}
   * </ul>
   */
  @Test
  void testWithParametersEquals2() {
    // Arrange
    FunctionMatcher.WithParameters withParameters = new FunctionMatcher.WithParameters("Dr Jane Doe",
        new ArrayList<>());

    // Act and Assert
    assertEquals(withParameters, withParameters);
    int expectedHashCodeResult = withParameters.hashCode();
    assertEquals(expectedHashCodeResult, withParameters.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link FunctionMatcher.WithParameters#equals(Object)}
   *   <li>{@link FunctionMatcher.WithParameters#hashCode()}
   * </ul>
   */
  @Test
  void testWithParametersEquals3() {
    // Arrange
    FunctionMatcher.WithParameters withParameters = new FunctionMatcher.WithParameters("Dr Jane Doe",
        new ArrayList<>());
    FunctionMatcher.WithParameters withParameters2 = new FunctionMatcher.WithParameters("Dr Jane Doe",
        new ArrayList<>());

    // Act and Assert
    assertEquals(withParameters, withParameters2);
    int expectedHashCodeResult = withParameters.hashCode();
    assertEquals(expectedHashCodeResult, withParameters2.hashCode());
  }

  /**
   * Method under test: {@link FunctionMatcher.WithParameters#equals(Object)}
   */
  @Test
  void testWithParametersEquals4() {
    // Arrange
    FunctionMatcher.WithParameters withParameters = new FunctionMatcher.WithParameters("Mr John Smith",
        new ArrayList<>());

    // Act and Assert
    assertNotEquals(withParameters, new FunctionMatcher.WithParameters("Dr Jane Doe", new ArrayList<>()));
  }

  /**
   * Method under test: {@link FunctionMatcher.WithParameters#equals(Object)}
   */
  @Test
  void testWithParametersEquals5() {
    // Arrange
    ArrayList<String> parameters = new ArrayList<>();
    parameters.add("foo");
    FunctionMatcher.WithParameters withParameters = new FunctionMatcher.WithParameters("Dr Jane Doe", parameters);

    // Act and Assert
    assertNotEquals(withParameters, new FunctionMatcher.WithParameters("Dr Jane Doe", new ArrayList<>()));
  }
}

