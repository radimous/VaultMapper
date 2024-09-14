package com.nodiumhosting.vaultmapper.map;

public class VaultCell {
    public int x;
    public int z;
    public boolean explored = false;
    public boolean marked = false;
    public boolean inscripted = false;
    public CellType cellType;
    public RoomType roomType;

    public VaultCell(int x, int z, CellType cellType, RoomType roomType) {
        this.x = x;
        this.z = z;
        this.cellType = cellType;
        this.roomType = roomType;
    }

    /**
     * @return Result of operation (true if switched from off to on)
     */
    public boolean switchMarked() {
        this.marked = !this.marked;
        return this.marked;
    }

    public void setExplored(boolean explored) {
        this.explored = explored;
    }
}
