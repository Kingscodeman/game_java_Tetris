/*
 * Decompiled with CFR 0.152.
 */
class Tetromino {
    final TetrominoType type;
    int rotation;
    int x;
    int y;

    Tetromino(TetrominoType tetrominoType) {
        this.type = tetrominoType;
        this.rotation = 0;
        this.x = 0;
        this.y = 0;
    }
}
