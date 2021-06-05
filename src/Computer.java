public class Computer {
    private final String vendor;
    private final String name;
    private final Processor processor;
    private final RAM ram;
    private final HardDrive hardDrive;
    private final Screen screen;
    private final Keyboard keyboard;

    public  Computer(String vendor, String name,Processor processor, RAM ram, HardDrive hardDrive, Screen screen,
                     Keyboard keyboard){
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.screen = screen;
        this.keyboard = keyboard;
    }
    public Processor getProcessor(){
        return this.processor;
    }


    public  int getTotalWeight() {
        return this.processor.getWeight() + this.keyboard.getWeight()+ this.ram.getWeight() + this.hardDrive.getWeight()+
                this.screen.getWeight() ;
    }

    @Override
    public String toString() {
        return "Компьютер марки "+ this.vendor + " Модель- " + this.name +" \n"+
                this.processor.toString() +
                this.ram.toString() + " \n" +
                this.hardDrive.toString() + " \n" +
                this.screen.toString() + "\n"+
                this.keyboard.toString()+
                "\nОбщий вес компьютера равен - "+ getTotalWeight()+ " грамм.\n";
    }
}


