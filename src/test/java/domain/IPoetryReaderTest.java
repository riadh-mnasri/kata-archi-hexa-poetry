package domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class IPoetryReaderTest {
    @Test
    public void give_me_some_poetry() {
        IObtainPoems poem = Mockito.mock(IObtainPoems.class);
        Mockito.when(poem.getPoem()).thenReturn("Souvent, pour s'amuser, les hommes d'équipage\n" +
                "Prennent des albatros, vastes oiseaux des mers,\n" +
                "Qui suivent, indolents compagnons de voyage,\n" +
                "Le navire glissant sur les gouffres amers.");
        IRequestVerses verses = new PoetryReader(poem);

        Assertions.assertThat(verses.giveMeSomePoetry()).isEqualTo("Souvent, pour s'amuser, les hommes d'équipage\n" +
                "Prennent des albatros, vastes oiseaux des mers,\n" +
                "Qui suivent, indolents compagnons de voyage,\n" +
                "Le navire glissant sur les gouffres amers.");
    }

    @Test
    public void provide_some_poetry() {
        ICanWriteLines console = Mockito.mock(ICanWriteLines.class);
        IObtainPoems poem = Mockito.mock(IObtainPoems.class);
        Mockito.when(poem.getPoem()).thenReturn(null);

        IRequestVerses verses = new PoetryReader(poem);
        verses.giveMeSomePoetry(console);
        Mockito.verify(console).writeLines(Mockito.any());

    }
}
