package simpler_project;

public class Cadeau {
    private String buyer;
    private String gift;
    private String receiver;

    public Cadeau(String buyer, String gift) {
        this.buyer = buyer;
        this.gift = gift;
    }

    public String getBuyer() {
        return buyer;
    }

    public String getGift() {
        return gift;
    }

    public String getReceiver() {
        return receiver;
    }


    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
