package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenReturnPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Assert.assertEquals(Cell.A1, bishopBlack.position());
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cells = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(cells, bishopBlack.way(Cell.G5));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenIsDiagonalFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        bishopBlack.way(Cell.A8);
    }

    @Test
    public void whenReturnCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Assert.assertEquals(Cell.A2, bishopBlack.copy(Cell.A2).position());
    }
}