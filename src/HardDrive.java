public class HardDrive {
    private  String type;
    private  int size;
    private  int weight;

    public HardDrive(HardType type, HardSize size){

        this.type= type.getName();

        switch (size){
            case BIG:
                this.size = size.getSize();
                weight = 900;
                break;
            case MIDDLE:
                this.size =size.getSize();
                weight = 800;
                break;
            case SMALL:
                this.size = size.getSize();
                weight = 700;
                break;
        }
    }
    public  int getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return "Жесткий диск "+ type +
                " размером "+ size + " ГБ"+
                " весом " + weight + "грамм";
    }
}
