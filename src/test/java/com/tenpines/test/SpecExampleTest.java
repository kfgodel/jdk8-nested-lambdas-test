package com.tenpines.test;

import info.kfgodel.jspek.api.JavaSpec;
import info.kfgodel.jspek.api.JavaSpecRunner;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JavaSpecRunner.class)
public class SpecExampleTest extends JavaSpec<CompileTestContext> {

  @Override
  public void define() {

    describe("nivel 1", () -> {
      describe("nivel 2", () -> {
        describe("nivel 3", () -> {
          describe("nivel 4", () -> {
            describe("nivel 5", () -> {
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
