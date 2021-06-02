public class Screen {
    private static ScreenType type;
    private static int size;
    private static int weight;

    public Screen(ScreenType screenType, ScreenSize screenSize){
        switch (screenType){
            case TN:
                type =ScreenType.TN;
                break;
            case VA:
                type =ScreenType.VA;
                break;
            case IPS:
                type =ScreenType.IPS;
                break;
        }
        switch (screenSize){
            case LOW:
                Screen.size = ScreenSize.LOW.getSize();
                weight = 600;
                break;
            case MIDDLE:
                Screen.size = ScreenSize.MIDDLE.getSize();
                weight = 800;
                break;
            case BIG:
                Screen.size = ScreenSize.BIG.getSize();
                weight = 1000;
                break;
        }
    }
    public static int getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return "Экран с матрицей "+ type+
                " размером " + size+ " дюймов." +
                " Вес "+ getWeight() +" грамм";
    }
}
