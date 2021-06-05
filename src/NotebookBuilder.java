public class NotebookBuilder implements Builder {

    private  String vendor;
    private  String name;
    private  Processor processor;
    private  RAM ram;
    private  HardDrive hardDrive;
    private  Screen screen;
    private  Keyboard keyboard;


    @Override
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setProcessor(Processor processor) {
        this.processor=processor;
    }

    @Override
    public void setRAM(RAM ram) {
        this.ram = ram;
    }

    @Override
    public void setHarddrive(HardDrive harddrive) {
        this.hardDrive= harddrive;
    }

    @Override
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Computer getComputer(){
        return new Computer(vendor,name,processor,ram,hardDrive,screen,keyboard);
    }
}
