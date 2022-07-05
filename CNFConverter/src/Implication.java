public class Implication extends Formula {
    public Implication(Formula left, Formula right) {
        this.left = left;
        this.right = right;
    }

    private Formula left;

    @Override
    public Formula getLeft() {
        return this.left;
    }

    private Formula right;

    @Override
    public Formula getRight() {
        return this.right;
    }

    @Override
    public String getRoot() {
        return "IMPLICATION";
    }

    @Override
    public Formula getCNF()  {
        if (this.isAtomic()) return this;

        if (this.getRoot().equals("IMPLICATION"))
        {
            Formula a = this.getLeft();
            Formula b = this.getRight();

            Formula newLeftPhase1 = a.getCNF();
            Formula newRightPhase1 = b.getCNF();

            return new Or(new Not(newLeftPhase1), newRightPhase1);
        }

        return null;
    }
}
