package io.gitlab.arturbosch.detekt.rules.documentation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

class OutdatedDocumentationDiffblueTest {
  /**
   * Method under test: {@link OutdatedDocumentation.Declaration#component1()}
   */
  @Test
  void testDeclarationComponent1() {
    // Arrange, Act and Assert
    assertEquals("Name",
        (new OutdatedDocumentation.Declaration("Name", OutdatedDocumentation.DeclarationType.PARAM)).component1());
  }

  /**
   * Method under test: {@link OutdatedDocumentation.Declaration#component2()}
   */
  @Test
  void testDeclarationComponent2() {
    // Arrange, Act and Assert
    assertEquals(OutdatedDocumentation.DeclarationType.PARAM,
        (new OutdatedDocumentation.Declaration("Name", OutdatedDocumentation.DeclarationType.PARAM)).component2());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link OutdatedDocumentation.Declaration#Declaration(String, OutdatedDocumentation.DeclarationType)}
  *   <li>{@link OutdatedDocumentation.Declaration#toString()}
  *   <li>{@link OutdatedDocumentation.Declaration#getName()}
  *   <li>{@link OutdatedDocumentation.Declaration#getType()}
  * </ul>
  */
  @Test
  void testDeclarationConstructor() {
    // Arrange and Act
    OutdatedDocumentation.Declaration actualDeclaration = new OutdatedDocumentation.Declaration("Name",
        OutdatedDocumentation.DeclarationType.PARAM);
    String actualToStringResult = actualDeclaration.toString();

    // Assert
    assertEquals("Name", actualDeclaration.getName());
    assertEquals(OutdatedDocumentation.DeclarationType.PARAM, actualDeclaration.getType());
    assertEquals("Declaration(name=Name, type=PARAM)", actualToStringResult);
  }

  /**
   * Method under test: {@link OutdatedDocumentation.Declaration#Declaration(String, OutdatedDocumentation.DeclarationType)}
   */
  @Test
  void testDeclarationConstructor2() {
    // Arrange and Act
    OutdatedDocumentation.Declaration actualDeclaration = new OutdatedDocumentation.Declaration("Name",
        OutdatedDocumentation.DeclarationType.PARAM);

    // Assert
    assertEquals("Name", actualDeclaration.component1());
    assertEquals(OutdatedDocumentation.DeclarationType.PARAM, actualDeclaration.getType());
  }

  /**
   * Method under test: {@link OutdatedDocumentation.Declaration#copy(String, OutdatedDocumentation.DeclarationType)}
   */
  @Test
  void testDeclarationCopy() {
    // Arrange and Act
    OutdatedDocumentation.Declaration actualCopyResult = (new OutdatedDocumentation.Declaration("Name",
        OutdatedDocumentation.DeclarationType.PARAM)).copy("Name", OutdatedDocumentation.DeclarationType.PARAM);

    // Assert
    assertEquals("Name", actualCopyResult.component1());
    assertEquals(OutdatedDocumentation.DeclarationType.PARAM, actualCopyResult.getType());
  }

  /**
   * Method under test: {@link OutdatedDocumentation.Declaration#equals(Object)}
   */
  @Test
  void testDeclarationEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new OutdatedDocumentation.Declaration("Name", OutdatedDocumentation.DeclarationType.PARAM), null);
    assertNotEquals(new OutdatedDocumentation.Declaration("Name", OutdatedDocumentation.DeclarationType.PARAM),
        "Different type to Declaration");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link OutdatedDocumentation.Declaration#equals(Object)}
   *   <li>{@link OutdatedDocumentation.Declaration#hashCode()}
   * </ul>
   */
  @Test
  void testDeclarationEquals2() {
    // Arrange
    OutdatedDocumentation.Declaration declaration = new OutdatedDocumentation.Declaration("Name",
        OutdatedDocumentation.DeclarationType.PARAM);

    // Act and Assert
    assertEquals(declaration, declaration);
    int expectedHashCodeResult = declaration.hashCode();
    assertEquals(expectedHashCodeResult, declaration.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link OutdatedDocumentation.Declaration#equals(Object)}
   *   <li>{@link OutdatedDocumentation.Declaration#hashCode()}
   * </ul>
   */
  @Test
  void testDeclarationEquals3() {
    // Arrange
    OutdatedDocumentation.Declaration declaration = new OutdatedDocumentation.Declaration("Name",
        OutdatedDocumentation.DeclarationType.PARAM);
    OutdatedDocumentation.Declaration declaration2 = new OutdatedDocumentation.Declaration("Name",
        OutdatedDocumentation.DeclarationType.PARAM);

    // Act and Assert
    assertEquals(declaration, declaration2);
    int expectedHashCodeResult = declaration.hashCode();
    assertEquals(expectedHashCodeResult, declaration2.hashCode());
  }

  /**
   * Method under test: {@link OutdatedDocumentation.Declaration#equals(Object)}
   */
  @Test
  void testDeclarationEquals4() {
    // Arrange
    OutdatedDocumentation.Declaration declaration = new OutdatedDocumentation.Declaration(
        "io.gitlab.arturbosch.detekt.rules.documentation.OutdatedDocumentation$Declaration",
        OutdatedDocumentation.DeclarationType.PARAM);

    // Act and Assert
    assertNotEquals(declaration,
        new OutdatedDocumentation.Declaration("Name", OutdatedDocumentation.DeclarationType.PARAM));
  }

  /**
   * Method under test: {@link OutdatedDocumentation.Declaration#equals(Object)}
   */
  @Test
  void testDeclarationEquals5() {
    // Arrange
    OutdatedDocumentation.Declaration declaration = new OutdatedDocumentation.Declaration("Name",
        OutdatedDocumentation.DeclarationType.PROPERTY);

    // Act and Assert
    assertNotEquals(declaration,
        new OutdatedDocumentation.Declaration("Name", OutdatedDocumentation.DeclarationType.PARAM));
  }
}

