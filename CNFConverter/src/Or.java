public class Or extends Formula {
    public Or(Formula newLeftPhase2, Object p1) {
        super();
    }

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
        return "OR";
    }
}
