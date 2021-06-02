public class Main {
    public static void main(String[] args) {

        Computer comp1 = new Computer("MSI","BEAST",new Processor(ProcessorType.AMD,CoreQuantity.FOUR,
                CoreFrequency.HIGHT), new RAM(RamType.DDR4,RamCount.SIXTEEN),new HardDrive(HardType.SSD,HardSize.BIG),
                new Screen(ScreenType.IPS,ScreenSize.BIG), new Keyboard(KeyBoardType.SLIM,KeyBoardLighting.YES));

        Computer comp2 = new Computer("DELL","LOL",new Processor(ProcessorType.INTEL,CoreQuantity.FOUR,
                CoreFrequency.LOW), new RAM(RamType.DDR4,RamCount.SIXTEEN),new HardDrive(HardType.HDD,HardSize.BIG),
                new Screen(ScreenType.IPS,ScreenSize.LOW), new Keyboard(KeyBoardType.SLIM,KeyBoardLighting.YES));
        Computer comp3 = new Computer("LENOVO");
        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println(comp3);
    }

}
