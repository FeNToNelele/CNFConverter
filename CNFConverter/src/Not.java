import java.text.Normalizer;

public class Not extends Formula {
    public Not(Formula formula) {
        this.left = formula;
        this.right = null;
    }

    Formula left;

    @Override
    public Formula getLeft() {
        return this.left;
    }

    Formula right;

    @Override
    public Formula getRight() {
        return this.right;
    }

    @Override
    public String getRoot() {
        return "NOT";
    }

    @Override
    public Formula getCNF() {
        if (getLeft().isAtomic()) return this;

        if (this.getLeft().getRoot().equals("AND"))
        {
            Formula a = this.getLeft().getLeft();
            Formula b = this.getLeft().getRight();

            Formula newLeftPhase1 = new Not(a);
            Formula newLeftPhase2 = newLeftPhase1.getCNF();
            Formula newRightPhase1 = new Not(b);
            Formula newRightPhase2 = newRightPhase1.getCNF();

            return new Or(newLeftPhase2, newRightPhase2);
        }
        //implement A <=> B = (A => B) and (B => A)


        return null;
    }
}
