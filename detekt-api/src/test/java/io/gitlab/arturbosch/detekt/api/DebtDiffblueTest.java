package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class DebtDiffblueTest {
  /**
   * Method under test: {@link Debt#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals(1, (new Debt(1, 1, 1)).component1());
  }

  /**
   * Method under test: {@link Debt#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertEquals(1, (new Debt(1, 1, 1)).component2());
  }

  /**
   * Method under test: {@link Debt#component3()}
   */
  @Test
  void testComponent3() {
    // Arrange, Act and Assert
    assertEquals(1, (new Debt(1, 1, 1)).component3());
  }

  /**
   * Method under test: {@link Debt#Debt()}
   */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new Debt());
    assertThrows(IllegalArgumentException.class, () -> new Debt(-1, 1, 1));
    assertThrows(IllegalArgumentException.class, () -> new Debt(1, -1, 1));
    assertThrows(IllegalArgumentException.class, () -> new Debt(1, 1, -1));
    assertThrows(IllegalArgumentException.class, () -> new Debt(0, 0, 0));
  }

  /**
   * Method under test: {@link Debt#Debt(int, int, int)}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    Debt actualDebt = new Debt(1, 1, 1);

    // Assert
    assertEquals(1, actualDebt.component1());
    assertEquals(1, actualDebt.getMins());
    assertEquals(1, actualDebt.getHours());
  }

  /**
   * Method under test: {@link Debt#Debt(int, int, int)}
   */
  @Test
  void testConstructor3() {
    // Arrange and Act
    Debt actualDebt = new Debt(0, 1, 1);

    // Assert
    assertEquals(0, actualDebt.component1());
    assertEquals(1, actualDebt.getMins());
    assertEquals(1, actualDebt.getHours());
  }

  /**
   * Method under test: {@link Debt#Debt(int, int, int)}
   */
  @Test
  void testConstructor4() {
    // Arrange and Act
    Debt actualDebt = new Debt(0, 0, 1);

    // Assert
    assertEquals(0, actualDebt.component1());
    assertEquals(1, actualDebt.getMins());
    assertEquals(0, actualDebt.getHours());
  }

  /**
   * Method under test: {@link Debt#copy(int, int, int)}
   */
  @Test
  void testCopy() {
    // Arrange and Act
    Debt actualCopyResult = (new Debt(1, 1, 1)).copy(1, 1, 1);

    // Assert
    assertEquals(1, actualCopyResult.component1());
    assertEquals(1, actualCopyResult.getMins());
    assertEquals(1, actualCopyResult.getHours());
  }

  /**
   * Method under test: {@link Debt#copy(int, int, int)}
   */
  @Test
  void testCopy2() {
    // Arrange and Act
    Debt actualCopyResult = (new Debt(1, 1, 1)).copy(0, 1, 1);

    // Assert
    assertEquals(0, actualCopyResult.component1());
    assertEquals(1, actualCopyResult.getMins());
    assertEquals(1, actualCopyResult.getHours());
  }

  /**
   * Method under test: {@link Debt#copy(int, int, int)}
   */
  @Test
  void testCopy3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new Debt(1, 1, 1)).copy(-1, 1, 1));
  }

  /**
   * Method under test: {@link Debt#copy(int, int, int)}
   */
  @Test
  void testCopy4() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new Debt(1, 1, 1)).copy(1, -1, 1));
  }

  /**
   * Method under test: {@link Debt#copy(int, int, int)}
   */
  @Test
  void testCopy5() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new Debt(1, 1, 1)).copy(1, 1, -1));
  }

  /**
   * Method under test: {@link Debt#copy(int, int, int)}
   */
  @Test
  void testCopy6() {
    // Arrange and Act
    Debt actualCopyResult = (new Debt(1, 1, 1)).copy(0, 0, 1);

    // Assert
    assertEquals(0, actualCopyResult.component1());
    assertEquals(1, actualCopyResult.getMins());
    assertEquals(0, actualCopyResult.getHours());
  }

  /**
   * Method under test: {@link Debt#copy(int, int, int)}
   */
  @Test
  void testCopy7() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> (new Debt(1, 1, 1)).copy(0, 0, 0));
  }

  /**
  * Method under test: {@link Debt#equals(Object)}
  */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new Debt(1, 1, 1), "Other");
  }

  /**
   * Method under test: {@link Debt#plus(Debt)}
   */
  @Test
  void testPlus() {
    // Arrange
    Debt debt = new Debt(1, 1, 1);

    // Act
    Debt actualPlusResult = debt.plus(new Debt(1, 1, 1));

    // Assert
    assertEquals(2, actualPlusResult.component1());
    assertEquals(2, actualPlusResult.getMins());
    assertEquals(2, actualPlusResult.getHours());
  }

  /**
   * Method under test: {@link Debt#plus(Debt)}
   */
  @Test
  void testPlus2() {
    // Arrange
    Debt debt = new Debt(0, 1, 1);

    // Act
    Debt actualPlusResult = debt.plus(new Debt(0, 1, 1));

    // Assert
    assertEquals(0, actualPlusResult.component1());
    assertEquals(2, actualPlusResult.getMins());
    assertEquals(2, actualPlusResult.getHours());
  }

  /**
   * Method under test: {@link Debt#toString()}
   */
  @Test
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("1d 1h 1min", (new Debt(1, 1, 1)).toString());
    assertEquals("1h 1min", (new Debt(0, 1, 1)).toString());
    assertEquals("1d 1min", (new Debt(1, 0, 1)).toString());
    assertEquals("1d 1h", (new Debt(1, 1, 0)).toString());
  }
}

