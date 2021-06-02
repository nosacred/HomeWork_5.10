public class Computer {
    private static String vendor;
    private static String name;
    private static Processor processor;
    private static RAM ram;
    private static HardDrive hardDrive;
    private static Screen screen;
    private static Keyboard keyboard;

    public  Computer(String vendor, String name,Processor processor, RAM ram, HardDrive hardDrive, Screen screen,
                     Keyboard keyboard){
        Computer.vendor = vendor;
        Computer.name = name;
        Computer.processor = processor;
        Computer.ram = ram;
        Computer.hardDrive = hardDrive;
        Computer.screen = screen;
        Computer.keyboard = keyboard;
    }
    public Computer(String vendor){
        name = "ValeraEdition";
        processor = new Processor(ProcessorType.AMD,CoreQuantity.EIGHT,CoreFrequency.MIDDLE);
        ram = new RAM(RamType.DDR3,RamCount.FOUR);
        hardDrive = new HardDrive(HardType.SSD,HardSize.BIG);
        screen= new Screen(ScreenType.VA,ScreenSize.LOW);
        keyboard = new Keyboard(KeyBoardType.SLIM,KeyBoardLighting.NO);
    }

    public static int getTotalWeight() {
        return Processor.getWeight() + Keyboard.getWeight()+ RAM.getWeight() + HardDrive.getWeight()+
                Screen.getWeight() ;
    }

    @Override
    public String toString() {
        return "Компьютер марки "+ vendor + " Модель- " + name +" \n"+
                Computer.processor.toString() +
                Computer.ram.toString() + " \n" +
                Computer.hardDrive.toString() + " \n" +
                Computer.screen.toString() + "\n"+
                Computer.keyboard.toString()+
                "\nОбщий вес компьютера равен - "+ getTotalWeight()+ " грамм.";
    }
}


