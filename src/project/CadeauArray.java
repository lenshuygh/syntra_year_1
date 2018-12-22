package project;

public class CadeauArray {
    private Cadeau[] cadeauArray = new Cadeau[0];

    public void addCadeau(Cadeau newCadeau){
        int newArrayLength = cadeauArray.length + 1;
        Cadeau[] newCadeauArray = new Cadeau[newArrayLength];
        for (int i = 0; i < cadeauArray.length; i++) {
            newCadeauArray[i] = cadeauArray[i];
        }
        newCadeauArray[newArrayLength-1] = newCadeau;
        cadeauArray = newCadeauArray;
    }

    public Cadeau[] getCadeauArray(){
        return cadeauArray;
    }

    public int getSize() {
        return cadeauArray.length;
    }

    public void setReceiver(String receiver,int index) {
        cadeauArray[index].setReceiver(receiver);
    }

    public boolean isAlreadyGiven(Cadeau randomGift) {
        for (Cadeau cadeau : cadeauArray) {
            if(cadeau.getReceiver().equals(randomGift.getPerson())){
                return true;
            }
        }
        return false;
    }
}
