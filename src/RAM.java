public class RAM {
    private static String type;
    private static int quantity;
    private static int weight;

    public RAM(RamType ramType, RamCount ramCount) {

        RAM.type = ramType.getName();
        switch (ramCount){
            case FOUR:
                quantity =ramCount.getSize() ;
                weight = 100;
                break;
            case EIGHT:
                quantity = ramCount.getSize();
                weight = 200;
                break;
            case SIXTEEN:
                quantity = ramCount.getSize();
                weight = 400;
        }
    }

    public static int getWeight() {
        return weight;
    }
    public static int getQuantity(){
        return quantity;
    }

    @Override
    public String toString(){
        return "Оперативная память типа "+ type +
                " размером " + getQuantity()+ " Гб"+
                " и весом " + getWeight() + " грамм";
    }
}

