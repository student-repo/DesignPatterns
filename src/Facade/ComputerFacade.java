package Facade;

class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    int BOOT_ADDRESS = 12312;
    int BOOT_SECTOR = 12223;
    int SECTOR_SIZE = 2;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
