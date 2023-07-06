package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import org.junit.jupiter.api.Test;

class ExecutionModelDiffblueTest {
  /**
   * Method under test: {@link ExecutionModel#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange
    ForkJoinPool executorService = ForkJoinPool.commonPool();

    // Act and Assert
    assertSame(executorService, (new ExecutionModel(executorService, true, true)).component1());
  }

  /**
   * Method under test: {@link ExecutionModel#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertTrue((new ExecutionModel(ForkJoinPool.commonPool(), true, true)).component2());
    assertFalse((new ExecutionModel(ForkJoinPool.commonPool(), false, true)).component2());
  }

  /**
   * Method under test: {@link ExecutionModel#component3()}
   */
  @Test
  void testComponent3() {
    // Arrange, Act and Assert
    assertTrue((new ExecutionModel(ForkJoinPool.commonPool(), true, true)).component3());
    assertFalse((new ExecutionModel(ForkJoinPool.commonPool(), true, false)).component3());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ExecutionModel#ExecutionModel(ExecutorService, boolean, boolean)}
  *   <li>{@link ExecutionModel#toString()}
  *   <li>{@link ExecutionModel#getExecutorService()}
  *   <li>{@link ExecutionModel#getParallelAnalysis()}
  *   <li>{@link ExecutionModel#getParallelParsing()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    ExecutionModel actualExecutionModel = new ExecutionModel(ForkJoinPool.commonPool(), true, true);
    actualExecutionModel.toString();

    // Assert
    ExecutorService expectedExecutorService = actualExecutionModel.component1();
    assertSame(expectedExecutorService, actualExecutionModel.getExecutorService());
    assertTrue(actualExecutionModel.getParallelAnalysis());
    assertTrue(actualExecutionModel.getParallelParsing());
  }

  /**
   * Method under test: {@link ExecutionModel#copy(ExecutorService, boolean, boolean)}
   */
  @Test
  void testCopy() {
    // Arrange
    ExecutionModel executionModel = new ExecutionModel(ForkJoinPool.commonPool(), true, true);
    ForkJoinPool executorService = ForkJoinPool.commonPool();

    // Act
    ExecutionModel actualCopyResult = executionModel.copy(executorService, true, true);

    // Assert
    assertSame(executorService, actualCopyResult.component1());
    assertTrue(actualCopyResult.getParallelParsing());
    assertTrue(actualCopyResult.getParallelAnalysis());
  }

  /**
   * Method under test: {@link ExecutionModel#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new ExecutionModel(ForkJoinPool.commonPool(), true, true), null);
    assertNotEquals(new ExecutionModel(ForkJoinPool.commonPool(), true, true), "Different type to ExecutionModel");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ExecutionModel#equals(Object)}
   *   <li>{@link ExecutionModel#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    ExecutionModel executionModel = new ExecutionModel(ForkJoinPool.commonPool(), true, true);

    // Act and Assert
    assertEquals(executionModel, executionModel);
    int expectedHashCodeResult = executionModel.hashCode();
    assertEquals(expectedHashCodeResult, executionModel.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ExecutionModel#equals(Object)}
   *   <li>{@link ExecutionModel#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    ExecutionModel executionModel = new ExecutionModel(ForkJoinPool.commonPool(), true, true);
    ExecutionModel executionModel2 = new ExecutionModel(ForkJoinPool.commonPool(), true, true);

    // Act and Assert
    assertEquals(executionModel, executionModel2);
    int expectedHashCodeResult = executionModel.hashCode();
    assertEquals(expectedHashCodeResult, executionModel2.hashCode());
  }

  /**
   * Method under test: {@link ExecutionModel#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    ExecutionModel executionModel = new ExecutionModel(new ForkJoinPool(), true, true);

    // Act and Assert
    assertNotEquals(executionModel, new ExecutionModel(ForkJoinPool.commonPool(), true, true));
  }

  /**
   * Method under test: {@link ExecutionModel#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    ExecutionModel executionModel = new ExecutionModel(ForkJoinPool.commonPool(), false, true);

    // Act and Assert
    assertNotEquals(executionModel, new ExecutionModel(ForkJoinPool.commonPool(), true, true));
  }

  /**
   * Method under test: {@link ExecutionModel#equals(Object)}
   */
  @Test
  void testEquals6() {
    // Arrange
    ExecutionModel executionModel = new ExecutionModel(ForkJoinPool.commonPool(), true, false);

    // Act and Assert
    assertNotEquals(executionModel, new ExecutionModel(ForkJoinPool.commonPool(), true, true));
  }
}

