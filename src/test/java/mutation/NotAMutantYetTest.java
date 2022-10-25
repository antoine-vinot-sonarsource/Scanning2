package mutation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NotAMutantYetTest {

  @Test
  public void rename() {
    NotAMutantYet notAMutantYet = new NotAMutantYet();
    assertThat(notAMutantYet.iamNotAMutant()).isEqualTo("I am not a mutant!");
  }

}
