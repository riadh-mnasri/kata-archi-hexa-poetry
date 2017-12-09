package domain;

public class PoetryReader implements IRequestVerses {


    private final IObtainPoems poem;

    public PoetryReader(IObtainPoems poem) {

        this.poem = poem;
    }

    public String giveMeSomePoetry() {
        return poem.getPoem();
    }

    public void giveMeSomePoetry(ICanWriteLines console) {
        console.writeLines(giveMeSomePoetry());
    }


}
