public enum ProcessorType {
    AMD("AMD"),
    INTEL("INTEL");

    private final String name;
    ProcessorType(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
enum CoreQuantity{
    TWO(2), FOUR(4), EIGHT(8);
    private final int quantity;
    CoreQuantity(int size){
        this.quantity = size;
    }

    public int getQuantity() {
        return quantity;
    }
}
enum CoreFrequency{
    LOW(2),MIDDLE(3),HIGHT(4);
    private final int frequency;

    CoreFrequency(int size){
        this.frequency = size;
    }

    public int getFrequency() {
        return frequency;
    }
}
enum RamType{
    DDR3("DDR3"),
    DDR4("DDR4");
    private final String name;
    RamType(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
enum RamCount{
    FOUR(4),
    EIGHT(8),
    SIXTEEN(16);
    private final int size;
    RamCount(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
enum HardType{
    HDD("HDD"),
    SSD("SDD");
    private final String name;
    HardType(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
enum HardSize{
    SMALL(120),
    MIDDLE(240),
    BIG(500);
    private final int size;
    HardSize(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

enum ScreenSize {
    BIG(18), LOW(14), MIDDLE(16);
    private final int size;
    ScreenSize(int a){
        this.size = a;
    }

    public int getSize() {
        return size;
    }
}
enum ScreenType{
    IPS("IPS"),
    TN("TN"),
    VA("VA");

    private final String name;
    ScreenType(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
enum KeyBoardType{
    SLIM("Тонкая"),
    CLASSIC("Классическая");

    private final String name;
    KeyBoardType(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
enum KeyBoardLighting{
    YES("ЕСТЬ"),
    NO("НЕТ");
    private final String name;

    KeyBoardLighting(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
