/**
 * Közös ősosztály a formuláknak
 */

public abstract class Formula {
    //mindegyik egy bináris fa, ahol a szülő valamilyen logikai művelet
    //szerződésalapú: Ledokumentáljuk a lehetséget bementet és a kimenetet.
    //Meghatározzuk, hogy milyen pontos bemenet kell és garantáljuk a kimenetet

    /**
     * It returns the left operand if any.
     * If there is no left operand it returns Null object.
     * @return The left operand
     */

    public abstract Formula getLeft();

    /**
     * It returns the right operand if any.
     * If there is no right operand it returns Null object.
     * @return The right operand
     */
    public abstract Formula getRight();

    /**
     * Returns the name of the operator. Special case: atom
     * @return The name of the operator, or atom
     */
    public abstract String getRoot();

    /**
     * It returns the Conjunctive Normal Form (CNF)
     * of this formula using the following
     * rewrite rules:
     * If the input has an implication symbol it should return disjunction of negated left with unchanged right
     * A => B = not A or B
     * If the input is a double negated formulae it returns the formulae itself.
     * not, not A
     * If the root is negation of a conjunction it returns disjunction of both sides negated.
     * not(A and B) = not A or not B
     * If the root is negation of a disjunction it returns conjunction of both sides negated.
     * not(A or B) = not A and not B
     * If the root is a disjunction
     * where the right side is a conjunction of two other elements it returns the conjunction
     * A or (B and C) = (A or B) and (A or C)
     * @return CNF form of the formula
     */

    public boolean isAtomic() {
        return this instanceof Atom;
    }

    public Formula getCNF() {
        return null;
    }
}
