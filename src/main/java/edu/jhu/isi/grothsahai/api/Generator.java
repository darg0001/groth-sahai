package edu.jhu.isi.grothsahai.api;

import edu.jhu.isi.grothsahai.entities.CommonReferenceString;
import edu.jhu.isi.grothsahai.entities.Statement;
import edu.jhu.isi.grothsahai.entities.Witness;
import edu.jhu.isi.grothsahai.entities.impl.Pair;
import it.unisa.dia.gas.jpbc.Pairing;

import java.util.List;

public interface Generator {
    Pairing generatePairing();

    CommonReferenceString generateCRS(final Pairing pairing);

    Pair<List<Statement>, Witness> generateStatementAndWitness(final Pairing pairing);

    Pair<List<Statement>, Witness> generateStatementAndWitness(final Pairing pairing, final int aLength, final int bLength, final int nrOfStatements);
}
