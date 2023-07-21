package io.gitlab.arturbosch.detekt.core.settings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PropertiesFacadeDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link PropertiesFacade}
  *   <li>{@link PropertiesFacade#getProperties()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new PropertiesFacade()).getProperties().isEmpty());
    assertTrue((new PropertiesFacade()).getProperties().isEmpty());
  }

  /**
   * Method under test: {@link PropertiesFacade#register(String, Object)}
   */
  @Test
  void testRegister() {
    // Arrange
    PropertiesFacade propertiesFacade = new PropertiesFacade();

    // Act
    propertiesFacade.register("Key", "Value");

    // Assert
    assertEquals(1, propertiesFacade.getProperties().size());
  }
}

