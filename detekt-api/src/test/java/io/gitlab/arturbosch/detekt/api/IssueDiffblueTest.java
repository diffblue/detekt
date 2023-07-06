package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class IssueDiffblueTest {
  /**
   * Method under test: {@link Issue#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals("Id",
        (new Issue("Id", Severity.CodeSmell, "The characteristics of someone or something", new Debt(1, 1, 1)))
            .component1());
  }

  /**
   * Method under test: {@link Issue#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertEquals(Severity.CodeSmell,
        (new Issue("Id", Severity.CodeSmell, "The characteristics of someone or something", new Debt(1, 1, 1)))
            .component2());
  }

  /**
   * Method under test: {@link Issue#component3()}
   */
  @Test
  void testComponent3() {
    // Arrange, Act and Assert
    assertEquals("The characteristics of someone or something",
        (new Issue("Id", Severity.CodeSmell, "The characteristics of someone or something", new Debt(1, 1, 1)))
            .component3());
  }

  /**
   * Method under test: {@link Issue#component4()}
   */
  @Test
  void testComponent4() {
    // Arrange
    Debt debt = new Debt(1, 1, 1);

    // Act and Assert
    assertSame(debt,
        (new Issue("Id", Severity.CodeSmell, "The characteristics of someone or something", debt)).component4());
  }

  /**
  * Method under test: {@link Issue#Issue(String, Severity, String, Debt)}
  */
  @Test
  void testConstructor() {
    // Arrange
    Debt debt = new Debt(1, 1, 1);

    // Act
    Issue actualIssue = new Issue("U-U-U", Severity.CodeSmell, "The characteristics of someone or something", debt);

    // Assert
    assertEquals("U-U-U", actualIssue.component1());
    assertEquals(Severity.CodeSmell, actualIssue.getSeverity());
    assertEquals("The characteristics of someone or something", actualIssue.getDescription());
    assertSame(debt, actualIssue.getDebt());
  }
}

