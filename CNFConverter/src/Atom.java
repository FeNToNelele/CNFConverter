public class Atom extends Formula {
    public Atom(String propositionalVariable) {
        this.propositionalVariable = propositionalVariable;
    }

    private String propositionalVariable; //itéletváltozó

    @Override
    public Formula getLeft() {
        return null;
    }

    @Override
    public Formula getRight() {
        return null;
    }

    @Override
    public String getRoot() {
        return propositionalVariable;
    }
}
