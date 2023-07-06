package io.gitlab.arturbosch.detekt.rules.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class SwallowedExceptionDiffblueTest {
  /**
  * Method under test: {@link SwallowedException#getEXCEPTIONS_IGNORED_BY_DEFAULT()}
  */
  @Test
  void testGetEXCEPTIONS_IGNORED_BY_DEFAULT() {
    // Arrange and Act
    List<String> actualEXCEPTIONS_IGNORED_BY_DEFAULT = SwallowedException.getEXCEPTIONS_IGNORED_BY_DEFAULT();

    // Assert
    assertEquals(4, actualEXCEPTIONS_IGNORED_BY_DEFAULT.size());
    assertEquals("InterruptedException", actualEXCEPTIONS_IGNORED_BY_DEFAULT.get(0));
    assertEquals("MalformedURLException", actualEXCEPTIONS_IGNORED_BY_DEFAULT.get(1));
    assertEquals("NumberFormatException", actualEXCEPTIONS_IGNORED_BY_DEFAULT.get(2));
    assertEquals("ParseException", actualEXCEPTIONS_IGNORED_BY_DEFAULT.get(3));
  }
}

