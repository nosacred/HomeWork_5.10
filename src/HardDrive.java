public class HardDrive {
    private static String type;
    private static int size;
    private static int weight;

    public HardDrive(HardType type, HardSize size){

        HardDrive.type= type.getName();

        switch (size){
            case BIG:
                HardDrive.size = size.getSize();
                weight = 900;
                break;
            case MIDDLE:
                HardDrive.size =size.getSize();
                weight = 800;
                break;
            case SMALL:
                HardDrive.size = size.getSize();
                weight = 700;
                break;
        }
    }
    public static int getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return "Жесткий диск "+ type +
                " размером "+ size + " ГБ"+
                " весом " + weight + "грамм";
    }
}
