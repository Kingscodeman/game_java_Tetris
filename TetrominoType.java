/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;

enum TetrominoType {
    I(new Color(0, 196, 255), new int[][][]{new int[][]{{0, 1}, {1, 1}, {2, 1}, {3, 1}}, new int[][]{{2, 0}, {2, 1}, {2, 2}, {2, 3}}, new int[][]{{0, 2}, {1, 2}, {2, 2}, {3, 2}}, new int[][]{{1, 0}, {1, 1}, {1, 2}, {1, 3}}}),
    J(new Color(58, 102, 255), new int[][][]{new int[][]{{0, 0}, {0, 1}, {1, 1}, {2, 1}}, new int[][]{{1, 0}, {2, 0}, {1, 1}, {1, 2}}, new int[][]{{0, 1}, {1, 1}, {2, 1}, {2, 2}}, new int[][]{{1, 0}, {1, 1}, {0, 2}, {1, 2}}}),
    L(new Color(255, 153, 51), new int[][][]{new int[][]{{2, 0}, {0, 1}, {1, 1}, {2, 1}}, new int[][]{{1, 0}, {1, 1}, {1, 2}, {2, 2}}, new int[][]{{0, 1}, {1, 1}, {2, 1}, {0, 2}}, new int[][]{{0, 0}, {1, 0}, {1, 1}, {1, 2}}}),
    S(new Color(86, 220, 95), new int[][][]{new int[][]{{1, 0}, {2, 0}, {0, 1}, {1, 1}}, new int[][]{{1, 0}, {1, 1}, {2, 1}, {2, 2}}, new int[][]{{1, 1}, {2, 1}, {0, 2}, {1, 2}}, new int[][]{{0, 0}, {0, 1}, {1, 1}, {1, 2}}}),
    Z(new Color(255, 86, 86), new int[][][]{new int[][]{{0, 0}, {1, 0}, {1, 1}, {2, 1}}, new int[][]{{2, 0}, {1, 1}, {2, 1}, {1, 2}}, new int[][]{{0, 1}, {1, 1}, {1, 2}, {2, 2}}, new int[][]{{1, 0}, {0, 1}, {1, 1}, {0, 2}}});

    final Color color;
    final int[][][] shapes;

    private TetrominoType(Color color, int[][][] nArray) {
        this.color = color;
        this.shapes = nArray;
    }
}
