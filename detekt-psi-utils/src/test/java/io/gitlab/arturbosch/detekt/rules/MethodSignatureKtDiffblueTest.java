package io.gitlab.arturbosch.detekt.rules;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import kotlin.Pair;
import org.junit.jupiter.api.Test;

class MethodSignatureKtDiffblueTest {
  /**
  * Method under test: {@link MethodSignatureKt#extractMethodNameAndParams(String)}
  */
  @Test
  void testExtractMethodNameAndParams() {
    // Arrange and Act
    Pair<String, List<String>> actualExtractMethodNameAndParamsResult = MethodSignatureKt
        .extractMethodNameAndParams("Method Signature");

    // Assert
    assertEquals("Method Signature", actualExtractMethodNameAndParamsResult.component1());
    assertNull(actualExtractMethodNameAndParamsResult.getSecond());
  }

  /**
   * Method under test: {@link MethodSignatureKt#extractMethodNameAndParams(String)}
   */
  @Test
  void testExtractMethodNameAndParams2() {
    // Arrange and Act
    Pair<String, List<String>> actualExtractMethodNameAndParamsResult = MethodSignatureKt
        .extractMethodNameAndParams("(");

    // Assert
    assertEquals("", actualExtractMethodNameAndParamsResult.component1());
    assertTrue(actualExtractMethodNameAndParamsResult.getSecond().isEmpty());
  }

  /**
   * Method under test: {@link MethodSignatureKt#extractMethodNameAndParams(String)}
   */
  @Test
  void testExtractMethodNameAndParams3() {
    // Arrange and Act
    Pair<String, List<String>> actualExtractMethodNameAndParamsResult = MethodSignatureKt
        .extractMethodNameAndParams("(methodSignature");

    // Assert
    assertEquals("", actualExtractMethodNameAndParamsResult.component1());
    List<String> second = actualExtractMethodNameAndParamsResult.getSecond();
    assertEquals(1, second.size());
    assertEquals("methodSignature", second.get(0));
  }
}

