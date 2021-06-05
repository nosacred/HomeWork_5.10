public class Screen {
    private   ScreenType type;
    private  int size;
    private  int weight;

    public Screen(ScreenType type, ScreenSize screenSize){
        switch (type){
            case TN:
                this.type =ScreenType.TN;
                break;
            case VA:
                this.type =ScreenType.VA;
                break;
            case IPS:
                this.type =ScreenType.IPS;
                break;
        }
        switch (screenSize){
            case LOW:
                this.size = ScreenSize.LOW.getSize();
                weight = 600;
                break;
            case MIDDLE:
                this.size = ScreenSize.MIDDLE.getSize();
                weight = 800;
                break;
            case BIG:
                this.size = ScreenSize.BIG.getSize();
                weight = 1000;
                break;
        }
    }
    public int getWeight(){
        return this.weight;
    }
    @Override
    public String toString(){
        return "Экран с матрицей "+ type+
                " размером " + size+ " дюймов." +
                " Вес "+ getWeight() +" грамм";
    }
}
