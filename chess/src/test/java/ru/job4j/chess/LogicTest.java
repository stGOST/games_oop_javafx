package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.white.BishopWhite;

public class LogicTest {

    @Ignore
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenMoveDoNotCant() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A8));
        logic.add(new BishopWhite(Cell.B7));
        logic.move(Cell.A8, Cell.H1);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenMoveDoNotFoundFigure() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A8));
        logic.move(Cell.E1, Cell.H1);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMoveFigure() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A8));
        logic.move(Cell.A8, Cell.H6);
    }
}