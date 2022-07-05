public class And extends Formula {
    public And(Formula left, Formula right) {
        this.left = left;
        this.right = right;
    }

    private Formula left;
    private Formula right;

    private String propositionalVariable; //itéletváltozó

    @Override
    public Formula getLeft() {
        return this.left;
    }

    @Override
    public Formula getRight() {
        return this.right;
    }

    @Override
    public String getRoot() {
        return "AND";
    }
}
