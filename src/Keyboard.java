public class Keyboard {
    private  KeyBoardType type;
    private final String lighting;
    private  int weight;

    public Keyboard(KeyBoardType keyBoardType, KeyBoardLighting keyBoardLighting){
        switch (keyBoardType){
            case SLIM:
                type=keyBoardType;
                weight = 400;
                break;
            case CLASSIC:
                type = keyBoardType;
                weight = 500;
                break;
        }
        lighting=keyBoardLighting.getName();
    }

    public  int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Клавиатура " + type.getName() +
                 "\nНаличие подсветки в клавиатуре - " + lighting +
                "\nВес клавиатуры равен "+ getWeight() + " грамм";
    }
}
