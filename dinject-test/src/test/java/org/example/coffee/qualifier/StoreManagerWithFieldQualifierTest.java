package org.example.coffee.qualifier;

import io.dinject.BeanContext;
import io.dinject.BeanContextBuilder;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StoreManagerWithFieldQualifierTest {

  @Test
  public void test() {

    try (BeanContext context = new BeanContextBuilder().build()) {
      StoreManagerWithFieldQualifier manager = context.getBean(StoreManagerWithFieldQualifier.class);
      String store = manager.store();
      assertThat(store).isEqualTo("blue");
    }
  }
}