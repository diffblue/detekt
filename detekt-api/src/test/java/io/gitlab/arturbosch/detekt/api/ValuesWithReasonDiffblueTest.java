package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ValuesWithReasonDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ValuesWithReason#ValuesWithReason(List)}
  *   <li>{@link ValuesWithReason#toString()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("ValuesWithReason(values=[])", (new ValuesWithReason(new ArrayList<>())).toString());
  }

  /**
   * Method under test: {@link ValuesWithReason#ValuesWithReason(List)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    ArrayList<ValueWithReason> values = new ArrayList<>();

    // Act
    new ValuesWithReason(values);

    // Assert
    assertTrue(values.isEmpty());
  }

  /**
   * Method under test: {@link ValuesWithReason#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(ValuesWithReasonKt.valuesWithReason(new ArrayList<>()), null);
    assertNotEquals(ValuesWithReasonKt.valuesWithReason(new ArrayList<>()), "Different type to ValuesWithReason");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ValuesWithReason#equals(Object)}
   *   <li>{@link ValuesWithReason#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    ValuesWithReason valuesWithReasonResult = ValuesWithReasonKt.valuesWithReason(new ArrayList<>());

    // Act and Assert
    assertEquals(valuesWithReasonResult, valuesWithReasonResult);
    int expectedHashCodeResult = valuesWithReasonResult.hashCode();
    assertEquals(expectedHashCodeResult, valuesWithReasonResult.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ValuesWithReason#equals(Object)}
   *   <li>{@link ValuesWithReason#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    ValuesWithReason valuesWithReasonResult = ValuesWithReasonKt.valuesWithReason(new ArrayList<>());
    ValuesWithReason valuesWithReasonResult2 = ValuesWithReasonKt.valuesWithReason(new ArrayList<>());

    // Act and Assert
    assertEquals(valuesWithReasonResult, valuesWithReasonResult2);
    int expectedHashCodeResult = valuesWithReasonResult.hashCode();
    assertEquals(expectedHashCodeResult, valuesWithReasonResult2.hashCode());
  }

  /**
   * Method under test: {@link ValuesWithReason#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    ArrayList<ValueWithReason> values = new ArrayList<>();
    values.add(new ValueWithReason("42", "Just cause"));
    ValuesWithReason valuesWithReasonResult = ValuesWithReasonKt.valuesWithReason(values);

    // Act and Assert
    assertNotEquals(valuesWithReasonResult, ValuesWithReasonKt.valuesWithReason(new ArrayList<>()));
  }
}

