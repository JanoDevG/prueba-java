package com.example.pruebajava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ActiveProfiles("test")
class MatrixTest {

    @Test
    void additionArrayZero() {
        Matrix matrix = new Matrix(0,0,0);
        assertEquals(0, matrix.getMatrix().length);
    }

    @Test
    void additionArray() {
        Matrix matrix = new Matrix(0,5,0);
        assertEquals(0, matrix.getMatrix().length);
    }

    @Test
    void additionArrayOk() {
        Matrix matrix = new Matrix(5,5,2);
        assertTrue(matrix.getMatrix().length != 0);
    }

}