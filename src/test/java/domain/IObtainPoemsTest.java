package domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class IObtainPoemsTest {
    @Test
    public void give_a_poem() {
        IObtainPoems poem = Mockito.mock(IObtainPoems.class);
        Mockito.when(poem.getPoem()).thenReturn("A peine les ont-ils déposés sur les planches,\n" +
                "Que ces rois de l'azur, maladroits et honteux,\n" +
                "Laissent piteusement leurs grandes ailes blanches\n" +
                "Comme des avirons traîner à côté d'eux.");
        Assertions.assertThat(poem.getPoem()).isEqualTo("A peine les ont-ils déposés sur les planches,\n" +
                "Que ces rois de l'azur, maladroits et honteux,\n" +
                "Laissent piteusement leurs grandes ailes blanches\n" +
                "Comme des avirons traîner à côté d'eux.");
    }
}
