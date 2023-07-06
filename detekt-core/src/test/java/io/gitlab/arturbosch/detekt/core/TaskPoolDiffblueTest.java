package io.gitlab.arturbosch.detekt.core;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

class TaskPoolDiffblueTest {
  /**
   * Method under test: {@link TaskPool#awaitTermination(long, TimeUnit)}
   */
  @Test
  void testAwaitTermination() {
    // Arrange, Act and Assert
    assertTrue((new TaskPool(new DirectExecutor())).awaitTermination(1L, TimeUnit.NANOSECONDS));
    assertFalse((new TaskPool(ForkJoinPool.commonPool())).awaitTermination(1L, TimeUnit.NANOSECONDS));
    assertTrue((new TaskPool(new TaskPool(new DirectExecutor()))).awaitTermination(1L, TimeUnit.NANOSECONDS));
  }

  /**
  * Method under test: {@link TaskPool#TaskPool(ExecutorService)}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new TaskPool(new DirectExecutor())).isShutdown());
  }

  /**
   * Method under test: {@link TaskPool#invokeAll(Collection)}
   */
  @Test
  void testInvokeAll() {
    // Arrange
    TaskPool taskPool = new TaskPool(new DirectExecutor());

    // Act and Assert
    assertTrue(taskPool.invokeAll(new ArrayList<>()).isEmpty());
  }

  /**
   * Method under test: {@link TaskPool#invokeAll(Collection)}
   */
  @Test
  void testInvokeAll2() {
    // Arrange
    TaskPool taskPool = new TaskPool(new TaskPool(new DirectExecutor()));

    // Act and Assert
    assertTrue(taskPool.invokeAll(new ArrayList<>()).isEmpty());
  }

  /**
   * Method under test: {@link TaskPool#invokeAll(Collection, long, TimeUnit)}
   */
  @Test
  void testInvokeAll3() {
    // Arrange
    TaskPool taskPool = new TaskPool(new DirectExecutor());

    // Act and Assert
    assertTrue(taskPool.invokeAll(new ArrayList<>(), 1L, TimeUnit.NANOSECONDS).isEmpty());
  }

  /**
   * Method under test: {@link TaskPool#invokeAll(Collection, long, TimeUnit)}
   */
  @Test
  void testInvokeAll4() {
    // Arrange
    TaskPool taskPool = new TaskPool(new TaskPool(new DirectExecutor()));

    // Act and Assert
    assertTrue(taskPool.invokeAll(new ArrayList<>(), 1L, TimeUnit.NANOSECONDS).isEmpty());
  }

  /**
   * Method under test: {@link TaskPool#isShutdown()}
   */
  @Test
  void testIsShutdown() {
    // Arrange, Act and Assert
    assertTrue((new TaskPool(new DirectExecutor())).isShutdown());
    assertFalse((new TaskPool(ForkJoinPool.commonPool())).isShutdown());
    assertTrue((new TaskPool(new TaskPool(new DirectExecutor()))).isShutdown());
  }

  /**
   * Method under test: {@link TaskPool#isTerminated()}
   */
  @Test
  void testIsTerminated() {
    // Arrange, Act and Assert
    assertTrue((new TaskPool(new DirectExecutor())).isTerminated());
    assertFalse((new TaskPool(ForkJoinPool.commonPool())).isTerminated());
    assertTrue((new TaskPool(new TaskPool(new DirectExecutor()))).isTerminated());
  }

  /**
   * Method under test: {@link TaskPool#shutdownNow()}
   */
  @Test
  void testShutdownNow() {
    // Arrange, Act and Assert
    assertTrue((new TaskPool(new DirectExecutor())).shutdownNow().isEmpty());
    assertTrue((new TaskPool(new TaskPool(new DirectExecutor()))).shutdownNow().isEmpty());
  }
}

