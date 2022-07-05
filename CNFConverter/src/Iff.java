public class Iff extends Formula {
    public Iff(Formula left, Formula right) {
        this.left = left;
        this.right = right;
    }


    //new And(new Implication(a, b), new Implication(b, a))
    //new And(new Or(new Not(a), b), new Or(new Not(b)), a)

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
        return "IFF";
    }

    @Override
    public Formula getCNF()  {
        if (this.isAtomic()) return this;

        if (this.getRoot().equals("IFF"))
        {
            Formula a = this.getLeft();
            Formula b = this.getRight();

            Formula newLeftPhase1 = new Implication(a, b);
            Formula newLeftPhase2 = newLeftPhase1.getCNF();
            Formula newRightPhase1 = new Implication(b, a);
            Formula newRightPhase2 = newRightPhase1.getCNF();

            return new And(newLeftPhase2, newRightPhase2);
        }

        return null;
    }
}
