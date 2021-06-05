public class RAM {
    private final String type;
    private  int quantity;
    private  int weight;

    public RAM(RamType ramType, RamCount ramCount) {

        this.type = ramType.getName();
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

    public int getWeight() {
        return weight;
    }
    public  int getQuantity(){
        return quantity;
    }

    @Override
    public String toString(){
        return "Оперативная память типа "+ type +
                " размером " + getQuantity()+ " Гб"+
                " и весом " + getWeight() + " грамм";
    }
}

