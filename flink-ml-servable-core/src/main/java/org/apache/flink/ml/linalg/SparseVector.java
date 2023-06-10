package org.apache.flink.ml.linalg;

public interface SparseVector extends Vector {

    int[] getIndices();

    long[] getIndicesAsLongArray();

    double[] getValues();

}
