package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    public void positionIsRight() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position()).isEqualTo(Cell.C8);
    }

    @Test
    public void copyIsRight() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Figure copyOfBishopBlack = bishopBlack.copy(Cell.D7);
        assertThat(copyOfBishopBlack.position()).isEqualTo(Cell.D7);
    }

    @Test
    public void wayIsRight() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.G5);
        Cell[] expectedWay = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(way).isEqualTo(expectedWay);
    }
}