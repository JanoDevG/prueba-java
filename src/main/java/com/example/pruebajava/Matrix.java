package com.example.pruebajava;

/**
 * @Author: Alejandro Gutiérrez
 */
public class Matrix {

    private int[][] matrix;

    public Matrix() {
    }

    /**
     * The method construct this class
     *
     * @param r is a coordinate
     * @param c is a coordinate
     * @param z is a domain
     */
    public Matrix(final int r, final int c, final int z) {
        createMatrix(r, c, z);
    }

    protected int[][] getMatrix() {
        return matrix;
    }

    /**
     * Method from create matrix
     *
     * @param r is a coordinate
     * @param c is a coordinate
     * @param z is a domain
     */
    private void createMatrix(final int r, final int c, final int z) {
        assert r >= 0;
        assert c >= 0;
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 && z > 1) { // Z = Z + R –1
                    for (int k = 0; k < c; k++) {
                        matrix[0][k] = (int) (z + (j + 1) - 1);
                    }
                    break;
                }
                matrix[i][j] = (int) (z + (i + 1) - 1);
            }
        }
        this.matrix = matrix;
    }

    /**
     * summary of values into matrix
     *
     * @param x is a coordinate
     * @param y is a coordinate
     */
    protected int additionArray(final int x, final int y) {
        int addition = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                addition += this.matrix[i][j];
            }
        }
        return addition;
    }
}
