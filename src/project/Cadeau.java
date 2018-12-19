package project;

public class Cadeau {
    private static int count = 0 ;
    private String giver ;
    private String receiver ;
    private String gift ;

    {
      count++;
    }

    public Cadeau (String giver, String gift){
        this.setGiver(giver);
        this.setGift(gift);
    }

    private void setGift(String gift) {
        this.gift=gift;
    }

    private void setGiver(String giver) {
        this.giver=giver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getGiver () {
        return this.giver;
    }
    public String getReceiver() {
        return this.receiver;
    }

    public String getGift(){
        return this.gift;
    }
    public int getCount(){
        return count;
    }

}

