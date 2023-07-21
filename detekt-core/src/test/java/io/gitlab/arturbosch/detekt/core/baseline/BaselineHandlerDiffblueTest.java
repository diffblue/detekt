package io.gitlab.arturbosch.detekt.core.baseline;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.xml.sax.Attributes;
import org.xml.sax.ext.Attributes2Impl;

class BaselineHandlerDiffblueTest {
  /**
   * Method under test: {@link BaselineHandler#characters(char[], int, int)}
   */
  @Test
  void testCharacters() {
    // Arrange
    BaselineHandler baselineHandler = new BaselineHandler();

    // Act
    baselineHandler.characters("AZAZ".toCharArray(), 1, 3);

    // Assert that nothing has changed
    DefaultBaseline createBaseline$detekt_coreResult = baselineHandler.createBaseline$detekt_core();
    Set<String> component1Result = createBaseline$detekt_coreResult.component1();
    assertTrue(component1Result.isEmpty());
    assertSame(component1Result, createBaseline$detekt_coreResult.getManuallySuppressedIssues());
    Set<String> currentIssues = createBaseline$detekt_coreResult.getCurrentIssues();
    assertTrue(currentIssues.isEmpty());
    assertSame(currentIssues, createBaseline$detekt_coreResult.component2());
  }

  /**
  * Method under test: default or parameterless constructor of {@link BaselineHandler}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    DefaultBaseline createBaseline$detekt_coreResult = (new BaselineHandler()).createBaseline$detekt_core();
    Set<String> component1Result = createBaseline$detekt_coreResult.component1();
    assertTrue(component1Result.isEmpty());
    assertSame(component1Result, createBaseline$detekt_coreResult.getManuallySuppressedIssues());
    Set<String> currentIssues = createBaseline$detekt_coreResult.getCurrentIssues();
    assertTrue(currentIssues.isEmpty());
    assertSame(currentIssues, createBaseline$detekt_coreResult.component2());
  }

  /**
   * Method under test: {@link BaselineHandler#createBaseline$detekt_core()}
   */
  @Test
  void testCreateBaseline$detekt_core() {
    // Arrange and Act
    DefaultBaseline actualCreateBaseline$detekt_coreResult = (new BaselineHandler()).createBaseline$detekt_core();

    // Assert
    assertTrue(actualCreateBaseline$detekt_coreResult.component1().isEmpty());
    assertTrue(actualCreateBaseline$detekt_coreResult.getCurrentIssues().isEmpty());
  }

  /**
   * Method under test: {@link BaselineHandler#endElement(String, String, String)}
   */
  @Test
  void testEndElement() {
    // Arrange
    BaselineHandler baselineHandler = new BaselineHandler();

    // Act
    baselineHandler.endElement("Uri", "Local Name", "Q Name");

    // Assert that nothing has changed
    DefaultBaseline createBaseline$detekt_coreResult = baselineHandler.createBaseline$detekt_core();
    Set<String> component1Result = createBaseline$detekt_coreResult.component1();
    assertTrue(component1Result.isEmpty());
    assertSame(component1Result, createBaseline$detekt_coreResult.getManuallySuppressedIssues());
    Set<String> currentIssues = createBaseline$detekt_coreResult.getCurrentIssues();
    assertTrue(currentIssues.isEmpty());
    assertSame(currentIssues, createBaseline$detekt_coreResult.component2());
  }

  /**
   * Method under test: {@link BaselineHandler#endElement(String, String, String)}
   */
  @Test
  void testEndElement2() {
    // Arrange
    BaselineHandler baselineHandler = new BaselineHandler();

    // Act
    baselineHandler.endElement("Uri", "Local Name", DefaultBaselineKt.CURRENT_ISSUES);

    // Assert that nothing has changed
    DefaultBaseline createBaseline$detekt_coreResult = baselineHandler.createBaseline$detekt_core();
    Set<String> component1Result = createBaseline$detekt_coreResult.component1();
    assertTrue(component1Result.isEmpty());
    assertSame(component1Result, createBaseline$detekt_coreResult.getManuallySuppressedIssues());
    Set<String> currentIssues = createBaseline$detekt_coreResult.getCurrentIssues();
    assertTrue(currentIssues.isEmpty());
    assertSame(currentIssues, createBaseline$detekt_coreResult.component2());
  }

  /**
   * Method under test: {@link BaselineHandler#endElement(String, String, String)}
   */
  @Test
  void testEndElement3() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class,
        () -> (new BaselineHandler()).endElement("Uri", "Local Name", DefaultBaselineKt.ID));
  }

  /**
   * Method under test: {@link BaselineHandler#endElement(String, String, String)}
   */
  @Test
  void testEndElement4() {
    // Arrange
    BaselineHandler baselineHandler = new BaselineHandler();

    // Act
    baselineHandler.endElement("Uri", "Local Name", DefaultBaselineKt.MANUALLY_SUPPRESSED_ISSUES);

    // Assert that nothing has changed
    DefaultBaseline createBaseline$detekt_coreResult = baselineHandler.createBaseline$detekt_core();
    Set<String> component1Result = createBaseline$detekt_coreResult.component1();
    assertTrue(component1Result.isEmpty());
    assertSame(component1Result, createBaseline$detekt_coreResult.getManuallySuppressedIssues());
    Set<String> currentIssues = createBaseline$detekt_coreResult.getCurrentIssues();
    assertTrue(currentIssues.isEmpty());
    assertSame(currentIssues, createBaseline$detekt_coreResult.component2());
  }

  /**
   * Method under test: {@link BaselineHandler#startElement(String, String, String, Attributes)}
   */
  @Test
  void testStartElement() {
    // Arrange
    BaselineHandler baselineHandler = new BaselineHandler();

    // Act
    baselineHandler.startElement("Uri", "Local Name", "Q Name", new Attributes2Impl());

    // Assert that nothing has changed
    DefaultBaseline createBaseline$detekt_coreResult = baselineHandler.createBaseline$detekt_core();
    Set<String> component1Result = createBaseline$detekt_coreResult.component1();
    assertTrue(component1Result.isEmpty());
    assertSame(component1Result, createBaseline$detekt_coreResult.getManuallySuppressedIssues());
    Set<String> currentIssues = createBaseline$detekt_coreResult.getCurrentIssues();
    assertTrue(currentIssues.isEmpty());
    assertSame(currentIssues, createBaseline$detekt_coreResult.component2());
  }

  /**
   * Method under test: {@link BaselineHandler#startElement(String, String, String, Attributes)}
   */
  @Test
  void testStartElement2() {
    // Arrange
    BaselineHandler baselineHandler = new BaselineHandler();

    // Act
    baselineHandler.startElement("foo", "foo", (String) DefaultBaselineKt.CURRENT_ISSUES, new Attributes2Impl());

    // Assert
    DefaultBaseline createBaseline$detekt_coreResult = baselineHandler.createBaseline$detekt_core();
    Set<String> component1Result = createBaseline$detekt_coreResult.component1();
    assertTrue(component1Result.isEmpty());
    assertSame(component1Result, createBaseline$detekt_coreResult.getManuallySuppressedIssues());
    Set<String> currentIssues = createBaseline$detekt_coreResult.getCurrentIssues();
    assertTrue(currentIssues.isEmpty());
    assertSame(currentIssues, createBaseline$detekt_coreResult.component2());
  }

  /**
   * Method under test: {@link BaselineHandler#startElement(String, String, String, Attributes)}
   */
  @Test
  void testStartElement3() {
    // Arrange
    BaselineHandler baselineHandler = new BaselineHandler();

    // Act
    baselineHandler.startElement("foo", "foo", (String) "Whitelist", new Attributes2Impl());

    // Assert
    DefaultBaseline createBaseline$detekt_coreResult = baselineHandler.createBaseline$detekt_core();
    Set<String> component1Result = createBaseline$detekt_coreResult.component1();
    assertTrue(component1Result.isEmpty());
    assertSame(component1Result, createBaseline$detekt_coreResult.getManuallySuppressedIssues());
    Set<String> currentIssues = createBaseline$detekt_coreResult.getCurrentIssues();
    assertTrue(currentIssues.isEmpty());
    assertSame(currentIssues, createBaseline$detekt_coreResult.component2());
  }

  /**
   * Method under test: {@link BaselineHandler#startElement(String, String, String, Attributes)}
   */
  @Test
  void testStartElement4() {
    // Arrange
    BaselineHandler baselineHandler = new BaselineHandler();

    // Act
    baselineHandler.startElement("foo", "foo", (String) DefaultBaselineKt.MANUALLY_SUPPRESSED_ISSUES,
        new Attributes2Impl());

    // Assert
    DefaultBaseline createBaseline$detekt_coreResult = baselineHandler.createBaseline$detekt_core();
    Set<String> component1Result = createBaseline$detekt_coreResult.component1();
    assertTrue(component1Result.isEmpty());
    assertSame(component1Result, createBaseline$detekt_coreResult.getManuallySuppressedIssues());
    Set<String> currentIssues = createBaseline$detekt_coreResult.getCurrentIssues();
    assertTrue(currentIssues.isEmpty());
    assertSame(currentIssues, createBaseline$detekt_coreResult.component2());
  }

  /**
   * Method under test: {@link BaselineHandler#startElement(String, String, String, Attributes)}
   */
  @Test
  void testStartElement5() {
    // Arrange
    BaselineHandler baselineHandler = new BaselineHandler();

    // Act
    baselineHandler.startElement("foo", "foo", (String) "Blacklist", new Attributes2Impl());

    // Assert
    DefaultBaseline createBaseline$detekt_coreResult = baselineHandler.createBaseline$detekt_core();
    Set<String> component1Result = createBaseline$detekt_coreResult.component1();
    assertTrue(component1Result.isEmpty());
    assertSame(component1Result, createBaseline$detekt_coreResult.getManuallySuppressedIssues());
    Set<String> currentIssues = createBaseline$detekt_coreResult.getCurrentIssues();
    assertTrue(currentIssues.isEmpty());
    assertSame(currentIssues, createBaseline$detekt_coreResult.component2());
  }

  /**
   * Method under test: {@link BaselineHandler#startElement(String, String, String, Attributes)}
   */
  @Test
  void testStartElement6() {
    // Arrange
    BaselineHandler baselineHandler = new BaselineHandler();

    // Act
    baselineHandler.startElement("Uri", "Local Name", DefaultBaselineKt.ID, new Attributes2Impl());

    // Assert
    DefaultBaseline createBaseline$detekt_coreResult = baselineHandler.createBaseline$detekt_core();
    Set<String> component1Result = createBaseline$detekt_coreResult.component1();
    assertTrue(component1Result.isEmpty());
    assertSame(component1Result, createBaseline$detekt_coreResult.getManuallySuppressedIssues());
    Set<String> currentIssues = createBaseline$detekt_coreResult.getCurrentIssues();
    assertTrue(currentIssues.isEmpty());
    assertSame(currentIssues, createBaseline$detekt_coreResult.component2());
  }
}

