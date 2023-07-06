package io.gitlab.arturbosch.detekt.core.baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Finding;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class BaselineResultMappingDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link BaselineResultMapping}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    BaselineResultMapping actualBaselineResultMapping = new BaselineResultMapping();

    // Assert
    assertEquals("BaselineResultMapping", actualBaselineResultMapping.getId());
    assertEquals(-1, actualBaselineResultMapping.getPriority());
  }

  /**
   * Method under test: {@link BaselineResultMapping#getId()}
   */
  @Test
  void testGetId() {
    // Arrange, Act and Assert
    assertEquals("BaselineResultMapping", (new BaselineResultMapping()).getId());
  }

  /**
   * Method under test: {@link BaselineResultMapping#getPriority()}
   */
  @Test
  void testGetPriority() {
    // Arrange, Act and Assert
    assertEquals(-1, (new BaselineResultMapping()).getPriority());
  }

  /**
   * Method under test: {@link BaselineResultMapping#transformFindings(Map)}
   */
  @Test
  void testTransformFindings() {
    // Arrange
    BaselineResultMapping baselineResultMapping = new BaselineResultMapping();
    HashMap<String, List<? extends Finding>> findings = new HashMap<>();

    // Act
    Map<String, List<Finding>> actualTransformFindingsResult = baselineResultMapping.transformFindings(findings);

    // Assert
    assertSame(findings, actualTransformFindingsResult);
    assertTrue(actualTransformFindingsResult.isEmpty());
  }
}

