public class Main {
    public static void main(String[] args) {

//        Computer comp1 = new Computer("MSI","BEAST",new Processor(ProcessorType.AMD,CoreQuantity.FOUR,
//                CoreFrequency.HIGHT), new RAM(RamType.DDR4,RamCount.SIXTEEN),new HardDrive(HardType.SSD,HardSize.BIG),
//                new Screen(ScreenType.IPS,ScreenSize.BIG), new Keyboard(KeyBoardType.SLIM,KeyBoardLighting.YES));
//
        Computer comp4 = new Computer("DELL","LOL",new Processor(ProcessorType.INTEL,CoreQuantity.EIGHT,
                CoreFrequency.LOW), new RAM(RamType.DDR4,RamCount.SIXTEEN),new HardDrive(HardType.HDD,HardSize.BIG),
                new Screen(ScreenType.IPS,ScreenSize.LOW), new Keyboard(KeyBoardType.SLIM,KeyBoardLighting.YES));

        Computer comp5 = new Computer("XIAOMI","MAX",new Processor(ProcessorType.INTEL,CoreQuantity.EIGHT,
                CoreFrequency.HIGHT),new RAM(RamType.DDR4,RamCount.SIXTEEN),new HardDrive(HardType.SSD,HardSize.BIG),
                new Screen(ScreenType.IPS,ScreenSize.BIG),new Keyboard(KeyBoardType.CLASSIC,KeyBoardLighting.YES));
        Creator creator = new Creator();
        NotebookBuilder builder = new NotebookBuilder();
        NotebookBuilder builder2 = new NotebookBuilder();
        NotebookBuilder builder3 = new NotebookBuilder();

        creator.createLowNotebook(builder);
        creator.createMiddleNotebook(builder2);
        creator.createHightNotebook(builder3);

        Computer comp1 = builder.getComputer();
        Computer comp2 = builder2.getComputer();
        Computer comp3 = builder3.getComputer();

        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println(comp3);
        System.out.println(comp4);
        System.out.println(comp5);

    }

}
