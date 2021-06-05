import jdk.jfr.Frequency;

public class Creator {
    public void createLowNotebook(Builder builder){
        builder.setVendor("DELL");
        builder.setName("Simple");
        builder.setProcessor(new Processor(ProcessorType.AMD,CoreQuantity.TWO,CoreFrequency.LOW));
        builder.setRAM(new RAM(RamType.DDR3,RamCount.FOUR));
        builder.setHarddrive(new HardDrive(HardType.HDD,HardSize.SMALL));
        builder.setScreen(new Screen(ScreenType.IPS,ScreenSize.LOW));
        builder.setKeyboard(new Keyboard(KeyBoardType.SLIM,KeyBoardLighting.NO));
    }

    public void createMiddleNotebook(Builder builder){
        builder.setVendor("ASUS");
        builder.setName("ROG");
        builder.setProcessor(new Processor(ProcessorType.INTEL,CoreQuantity.FOUR,CoreFrequency.MIDDLE));
        builder.setRAM(new RAM(RamType.DDR3,RamCount.EIGHT));
        builder.setHarddrive(new HardDrive(HardType.HDD,HardSize.BIG));
        builder.setScreen(new Screen(ScreenType.VA,ScreenSize.MIDDLE));
        builder.setKeyboard(new Keyboard(KeyBoardType.SLIM,KeyBoardLighting.YES));
    }

    public void createHightNotebook(Builder builder){
        builder.setVendor("MSI");
        builder.setName("GEPARD");
        builder.setProcessor(new Processor(ProcessorType.INTEL,CoreQuantity.EIGHT,CoreFrequency.HIGHT));
        builder.setRAM(new RAM(RamType.DDR4,RamCount.SIXTEEN));
        builder.setHarddrive(new HardDrive(HardType.SSD,HardSize.BIG));
        builder.setScreen(new Screen(ScreenType.TN,ScreenSize.BIG));
        builder.setKeyboard(new Keyboard(KeyBoardType.CLASSIC,KeyBoardLighting.YES));
    }

}
