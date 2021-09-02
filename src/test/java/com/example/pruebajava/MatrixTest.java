package com.example.pruebajava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ActiveProfiles("test")
class MatrixTest {

    @Test
    void testCreateR0C0() {
        Matrix matrix = new Matrix(0, 0, 0); // Z0
        assertEquals(0, matrix.getMatrix().length);
        matrix = new Matrix(0, 0, 1); // Z1
        assertEquals(0, matrix.getMatrix().length);
    }

    @Test
    void testCreateR1C0() {
        Matrix matrix = new Matrix(1, 0, 0); // Z0
        assertEquals(1, matrix.getMatrix().length);
        matrix = new Matrix(1, 0, 1); // Z1
        assertEquals(1, matrix.getMatrix().length);
    }

    @Test
    void testCreateR0C1() {
        Matrix matrix = new Matrix(0, 1, 0); // Z0
        assertEquals(0, matrix.getMatrix().length);
        matrix = new Matrix(0, 1, 1); // Z1
        assertEquals(0, matrix.getMatrix().length);
    }

    @Test
    void testCreateR1C1() {
        Matrix matrix = new Matrix(1, 1, 0);
        assertEquals(1, matrix.getMatrix().length);
        assertEquals(0, matrix.getMatrix()[0][0]);
        matrix = new Matrix(1, 1, 1);
        assertEquals(1, matrix.getMatrix().length);
        assertEquals(1, matrix.getMatrix()[0][0]);
    }

    @Test
    void testCreateNegativeR() {
        try {
            Matrix matrix = new Matrix(-1, 0, 0);
        } catch (AssertionError e) {
            return;
        }
        Assertions.fail();
    }

    @Test
    void testCreateNegativeC() {
        try {
            Matrix matrix = new Matrix(0, -1, 0);
        } catch (AssertionError e) {
            return;
        }
        Assertions.fail();
    }

    @Test
    void testAdditionArray() {
        Matrix matrix = new Matrix(3, 4, 1);
        assertEquals(3, matrix.getMatrix().length);
        assertEquals(4, matrix.getMatrix()[0].length);
        assertEquals(4, matrix.getMatrix()[1].length);
        assertEquals(4, matrix.getMatrix()[2].length);
        assertEquals(1, matrix.getMatrix()[0][0]);
        assertEquals(1, matrix.getMatrix()[0][1]);
        assertEquals(1, matrix.getMatrix()[0][2]);
        assertEquals(1, matrix.getMatrix()[0][3]);
        assertEquals(2, matrix.getMatrix()[1][0]);
        assertEquals(2, matrix.getMatrix()[1][1]);
        assertEquals(2, matrix.getMatrix()[1][2]);
        assertEquals(2, matrix.getMatrix()[1][3]);
        assertEquals(3, matrix.getMatrix()[2][0]);
        assertEquals(3, matrix.getMatrix()[2][1]);
        assertEquals(3, matrix.getMatrix()[2][2]);
        assertEquals(3, matrix.getMatrix()[2][3]);
    }
}