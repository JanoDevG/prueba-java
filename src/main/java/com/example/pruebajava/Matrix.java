package com.example.pruebajava;

/**
 * The type Matrix.
 */
public class Matrix {

    private byte[][] matrix;

    /**
     * instantiating a new matrix without arguments
     */
    public Matrix() {
    }

    /**
     * Instantiates a new Matrix with arguments.
     *
     * @param matrix the matrix (array 2D)
     */
    public Matrix(final byte[][] matrix) {
        setMatrix(matrix);
    }

    /**
     * Get matrix byte [ ] [ ].
     *
     * @return the byte [ ] [ ]
     */
    protected byte[][] getMatrix() {
        return matrix;
    }

    /**
     * Sets matrix.
     *
     * @param matrix the matrix
     */
    protected void setMatrix(final byte[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Create matrix byte [ ] [ ].
     *
     * @param r the r
     * @param c the c
     * @param z the z
     * @return the byte [ ] [ ]
     */
    protected byte[][] createMatrix(final byte r, final byte c, final byte z) {
        byte[][] matrix = new byte[r][c];
        for (byte i = 0; i < r; i++) {
            for (byte j = 0; j < c; j++) {
                if (i == 0 && z > 1) { // Z = Z + R –1
                    for (byte k = 0; k < c; k++) {
                        matrix[0][k] = (byte) (z + (j + 1) - 1);
                    }
                    break;
                }
                matrix[i][j] = (byte) (z + (i + 1) - 1);
            }
        }
        return matrix;
    }

    /**
     * Addition array byte.
     *
     * @param matrix the matrix
     * @param x      the x
     * @param y      the y
     * @return with the summation with the selected limits of the matrix
     */
    protected static byte additionArray(final byte[][] matrix, final byte x, final byte y) {
        byte addition = 0;
        for (byte i = 0; i < y; i++) {
            for (byte j = 0; j < x; j++) {
                addition += matrix[i][j];
            }
        }
        return addition;
    }
}
