package io.github.detekt.report.xml;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class Xml10EscapeSymbolsInitializerDiffblueTest {
  /**
  * Method under test: {@link Xml10EscapeSymbolsInitializer.XmlCodepointValidator#isValid(int)}
  */
  @Test
  void testXmlCodepointValidatorIsValid() {
    // Arrange, Act and Assert
    assertFalse((new Xml10EscapeSymbolsInitializer.XmlCodepointValidator()).isValid(1));
    assertTrue((new Xml10EscapeSymbolsInitializer.XmlCodepointValidator()).isValid(Integer.SIZE));
    assertTrue((new Xml10EscapeSymbolsInitializer.XmlCodepointValidator()).isValid(9));
    assertTrue((new Xml10EscapeSymbolsInitializer.XmlCodepointValidator()).isValid(10));
    assertTrue((new Xml10EscapeSymbolsInitializer.XmlCodepointValidator()).isValid(13));
    assertTrue((new Xml10EscapeSymbolsInitializer.XmlCodepointValidator()).isValid(57344));
    assertTrue((new Xml10EscapeSymbolsInitializer.XmlCodepointValidator()).isValid(65536));
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.Reference#Reference(String, int)}
   *   <li>{@link Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.Reference#getCodepoint$detekt_report_xml()}
   * </ul>
   */
  @Test
  void testXmlEscapeSymbols_ReferenceConstructor() {
    // Arrange, Act and Assert
    assertEquals(1,
        (new Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.Reference("Cer", 1)).getCodepoint$detekt_report_xml());
  }

  /**
   * Method under test: {@link Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.Reference#Reference(String, int)}
   */
  @Test
  void testXmlEscapeSymbols_ReferenceConstructor2() {
    // Arrange and Act
    Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.Reference actualReference = new Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.Reference(
        "Cer", 1);

    // Assert
    assertEquals(3, actualReference.getCer$detekt_report_xml().length);
    assertEquals(1, actualReference.getCodepoint$detekt_report_xml());
  }

  /**
   * Method under test: {@link Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.References#addReference(int, String)}
   */
  @Test
  void testXmlEscapeSymbols_ReferencesAddReference() {
    // Arrange
    Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.References references = new Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.References();

    // Act
    references.addReference(2, "Cer");

    // Assert
    ArrayList<Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.Reference> references$detekt_report_xml = references
        .getReferences$detekt_report_xml();
    assertEquals(1, references$detekt_report_xml.size());
    Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.Reference getResult = references$detekt_report_xml.get(0);
    assertEquals(3, getResult.getCer$detekt_report_xml().length);
    assertEquals(2, getResult.getCodepoint$detekt_report_xml());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>default or parameterless constructor of {@link Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.References}
   *   <li>{@link Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.References#getReferences$detekt_report_xml()}
   * </ul>
   */
  @Test
  void testXmlEscapeSymbols_ReferencesConstructor() {
    // Arrange, Act and Assert
    assertTrue(
        (new Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.References()).getReferences$detekt_report_xml().isEmpty());
    assertTrue(
        (new Xml10EscapeSymbolsInitializer.XmlEscapeSymbols.References()).getReferences$detekt_report_xml().isEmpty());
  }
}

