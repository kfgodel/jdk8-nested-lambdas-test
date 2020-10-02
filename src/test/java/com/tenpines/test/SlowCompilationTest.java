package com.tenpines.test;

import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import info.kfgodel.jspek.api.contexts.TestContext;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This class takes 23s to execute mvn clean test with jdk8, and only 9s with jdk11
 */
@RunWith(JavaSpecRunner.class)
public class SlowCompilationTest extends JavaSpec<TestContext> {

  @Override
  public void define() {

    describe("level 1", () -> {
      describe("level 2", () -> {
        describe("level 3", () -> {
          describe("level 4", () -> {
            describe("level 5", () -> {
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });

              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });

              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });

              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
              it("test",()->{
                assertThat("algo").isEqualToIgnoringCase("Algo");
              });
            });
          });
        });
      });
    });



  }
}
